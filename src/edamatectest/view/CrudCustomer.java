package edamatectest.view;

import edamatectest.dao.CustomerDAO;
import edamatectest.model.Customer;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CrudCustomer extends javax.swing.JFrame {

    public CrudCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldCpf = new javax.swing.JTextField();
        textFieldName = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldPhone = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud Básico");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Telefone");

        jLabel5.setText("Email");

        textFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCpfActionPerformed(evt);
            }
        });

        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(204, 51, 0));
        buttonDelete.setText("Deletar");
        buttonDelete.setAlignmentY(0.0F);
        buttonDelete.setPreferredSize(new java.awt.Dimension(85, 27));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonInsert.setBackground(new java.awt.Color(0, 102, 0));
        buttonInsert.setText("Cadastrar");
        buttonInsert.setAlignmentY(0.0F);
        buttonInsert.setMaximumSize(new java.awt.Dimension(76, 27));
        buttonInsert.setMinimumSize(new java.awt.Dimension(76, 27));
        buttonInsert.setPreferredSize(new java.awt.Dimension(85, 27));
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdate.setBackground(new java.awt.Color(153, 153, 0));
        buttonUpdate.setText("Editar");
        buttonUpdate.setAlignmentY(0.0F);
        buttonUpdate.setPreferredSize(new java.awt.Dimension(85, 27));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        textFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar  Cliente");

        buttonSearch.setBackground(new java.awt.Color(255, 255, 255));
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("Pesquisar");
        buttonSearch.setAlignmentY(0.0F);
        buttonSearch.setPreferredSize(new java.awt.Dimension(85, 27));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableCustomers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCpfActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        createCustomer();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        editCustomer();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void textFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSearchActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        searchCustomers();
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void createCustomer() {
        String name = textFieldName.getText();
        String cpf = textFieldCpf.getText();
        String phone = textFieldPhone.getText();
        String email = textFieldEmail.getText();

        if (name.isEmpty() || cpf.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            return;
        }

        Customer newCustomer = new Customer();
        newCustomer.setCustomerName(name);
        newCustomer.setCpf(cpf);
        newCustomer.setPhone(phone);
        newCustomer.setEmail(email);

        CustomerDAO custumerDao = new CustomerDAO();

        try {
            custumerDao.insertCustomer(newCustomer);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            clearFields();
        } catch (SQLException e) {
            if (e.getMessage().contains("Duplicate entry") || e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "Erro: CPF já cadastrado");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente" + e.getMessage());
            }
        }

    }

    private void editCustomer() {
        String name = textFieldName.getText().trim();
        String cpf = textFieldCpf.getText().trim();
        String phone = textFieldPhone.getText().trim();
        String email = textFieldEmail.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "CPF é obrigatório para atualizar.");
            return;
        }

        CustomerDAO dao = new CustomerDAO();
        Customer existingCustomer = dao.getCustomerByCpf(cpf);

        if (existingCustomer == null) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
            return;
        }

        if (!name.isEmpty()) {
            existingCustomer.setCustomerName(name);
        }
        if (!phone.isEmpty()) {
            existingCustomer.setPhone(phone);
        }
        if (!email.isEmpty()) {
            existingCustomer.setEmail(email);
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente atualizar os dados deste cliente?",
                "Confirmação de Atualização",
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        int result = dao.updateCustomer(existingCustomer);

        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Nada foi alterado.");
        }
    }

    private void deleteCustomer() {
        String cpf = textFieldCpf.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o CPF do cliente para excluir.");
            return;
        }

        CustomerDAO dao = new CustomerDAO();
        Customer customer = dao.getCustomerByCpf(cpf);

        if (customer == null) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o cliente " + customer.getCustomerName() + "?",
                "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return; // cancelou a exclusão
        }

        boolean deleted = dao.deleteCustomer(cpf);

        if (deleted) {
            JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir cliente.");
        }
    }

    private void searchCustomers() {
        String termoBusca = textFieldSearch.getText();
        if (termoBusca.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite um termo para buscar.");
            return;
        }

        CustomerDAO dao = new CustomerDAO();
        List<Customer> resultados = dao.searchCustomers(termoBusca);

        // Atualiza a tabela
        DefaultTableModel modelo = (DefaultTableModel) tableCustomers.getModel();
        modelo.setRowCount(0);

        for (Customer c : resultados) {
            modelo.addRow(new Object[]{
                c.getCustomerName(),
                c.getCpf(),
                c.getPhone(),
                c.getEmail()
            });
        }

        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum cliente encontrado.");
        }
    }

    private void clearFields() {
        textFieldName.setText("");
        textFieldCpf.setText("");
        textFieldPhone.setText("");
        textFieldEmail.setText("");

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTextField textFieldCpf;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldPhone;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables
}
