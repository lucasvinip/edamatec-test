package edamatectest;

import edamatectest.view.CrudCustomer;
import javax.swing.*;

public class EdamatecTest {

    public static void main(String[] args) {
        CrudCustomer crudCustomer = new CrudCustomer();
        crudCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crudCustomer.setVisible(true);
    }
}
