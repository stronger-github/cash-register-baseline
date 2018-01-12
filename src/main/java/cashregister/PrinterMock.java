package cashregister;

/**
 * @author zhangqiang26@jd.com
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @date 2018/1/12
 * @Description: TODO
 */

public class PrinterMock extends Printer{
    public boolean vaildatePrinterOk = false;
    public void print(String printThis) {
        System.out.println(printThis);
        vaildatePrinterOk = true;
    }
    public boolean isVaildatePrinterOk(){
        return vaildatePrinterOk;
    }
}
