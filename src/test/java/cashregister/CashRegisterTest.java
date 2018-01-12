package cashregister;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CashRegisterTest {



    @Test
    public void should_print_purchase_with_mock() {

        PrinterMock printer = new PrinterMock();
        CashRegister cashRegister = new CashRegister(printer);
        Item apple = new Item("apple",2);
        Item orange = new Item("orange",4);
        Item[] items = {apple,orange};
        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);
        Assert.assertEquals(true,printer.isVaildatePrinterOk());

    }

    @Test
    public void should_print_purchase_with_stub() {
        PrinterMock printer = new PrinterMock();
        CashRegister cashRegister = new CashRegister(printer);
        Purchase purchase = new PurchaseStub();
        cashRegister.process(purchase);
        Assert.assertEquals(true,printer.isVaildatePrinterOk());

    }

    @Test
    public void should_print_purchase_with_mockito() {
        Printer printer = mock(Printer.class);

        CashRegister cashRegister = new CashRegister(printer);
        Purchase purchase = mock(Purchase.class);
        String purchaseStr = "purchase string";
        when(purchase.asString()).thenReturn(purchaseStr);
        cashRegister.process(purchase);

        verify(purchase).asString();
        verify(printer).print(purchaseStr);
        Assert.assertEquals(purchaseStr,purchase.asString());



    }


}