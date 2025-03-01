
package restuarent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        this.setExtendedState(GUI.MAXIMIZED_BOTH);
        BillTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        BillTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        
        // Add KeyListener to txtCash
        txtCash.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) { // Check if Enter key is pressed
                    double total = Double.valueOf(lblTotal.getText());
                    double cash = Double.valueOf(txtCash.getText());
                    double balance = cash - total;
                    
                    DecimalFormat df = new DecimalFormat("00.00");
                    
                    lblBalance.setText(String.valueOf(df.format(balance)));
                }
            }
        });
        
    }
    
    public void addTable(String id, String Name, int Qty, Double Price) {
        DefaultTableModel dt = (DefaultTableModel) BillTable.getModel();
        
        DecimalFormat df = new DecimalFormat("00.00");
        double TotalPrice = Price * Double.valueOf(Qty);
        String NetPrice = df.format(TotalPrice);
        
        for (int row = 0; row < BillTable.getRowCount(); row++) {
            if (Name == BillTable.getValueAt(row, 1)) {
                dt.removeRow(BillTable.convertRowIndexToModel(row));
            }
        }
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(NetPrice);
        
        dt.addRow(v);
    }
    public void calculate() {
        int numOfRow = BillTable.getRowCount();
        double Total = 0.0;
        for (int i=0; i<numOfRow; i++) {
            double value = Double.valueOf(BillTable.getValueAt(i, 3).toString());
            Total += value;
        }
        DecimalFormat df = new DecimalFormat("00.00");
        lblTotal.setText(df.format(Total));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MRL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MRLQ = new javax.swing.JLabel();
        MRH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MRHQ = new javax.swing.JLabel();
        CRLQ = new javax.swing.JLabel();
        CRL = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CRH = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CRHQ = new javax.swing.JLabel();
        MKL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        MKLQ = new javax.swing.JLabel();
        MKH = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        MKHQ = new javax.swing.JLabel();
        CKL = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        CKLQ = new javax.swing.JLabel();
        CKH = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        CKHQ = new javax.swing.JLabel();
        CHKL = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CHKLQ = new javax.swing.JLabel();
        CHKH = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        CHKHQ = new javax.swing.JLabel();
        Bath = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        BathQ = new javax.swing.JLabel();
        Soup = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        SoupQ = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblBill = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/MRL.png"))); // NOI18N
        MRL.setPreferredSize(new java.awt.Dimension(115, 105));
        MRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRLActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel1.setText("Rs.1500");

        MRLQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MRLQ.setText("0");

        MRH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/MRH.png"))); // NOI18N
        MRH.setPreferredSize(new java.awt.Dimension(115, 105));
        MRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setText("Rs.1200");

        MRHQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MRHQ.setText("0");

        CRLQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CRLQ.setText("0");

        CRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CRL.png"))); // NOI18N
        CRL.setPreferredSize(new java.awt.Dimension(115, 105));
        CRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRLActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel6.setText("Rs.1200");

        CRH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CRH.png"))); // NOI18N
        CRH.setPreferredSize(new java.awt.Dimension(115, 105));
        CRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRHActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel7.setText("Rs.1000");

        CRHQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CRHQ.setText("0");

        MKL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/MKL.png"))); // NOI18N
        MKL.setPreferredSize(new java.awt.Dimension(115, 105));
        MKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKLActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel9.setText("Rs.1300");

        MKLQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MKLQ.setText("0");

        MKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/MKH.png"))); // NOI18N
        MKH.setPreferredSize(new java.awt.Dimension(115, 105));
        MKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKHActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel11.setText("Rs.1000");

        MKHQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MKHQ.setText("0");

        CKL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CKL.png"))); // NOI18N
        CKL.setPreferredSize(new java.awt.Dimension(115, 105));
        CKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CKLActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel13.setText("Rs.1000");

        CKLQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CKLQ.setText("0");

        CKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CKH.png"))); // NOI18N
        CKH.setPreferredSize(new java.awt.Dimension(115, 105));
        CKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CKHActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel15.setText("Rs.500");

        CKHQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CKHQ.setText("0");

        CHKL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CHKL.png"))); // NOI18N
        CHKL.setPreferredSize(new java.awt.Dimension(115, 105));
        CHKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHKLActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel17.setText("Rs.1700");

        CHKLQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CHKLQ.setText("0");

        CHKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/CHKH.png"))); // NOI18N
        CHKH.setPreferredSize(new java.awt.Dimension(115, 105));
        CHKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHKHActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel19.setText("Rs.1400");

        CHKHQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CHKHQ.setText("0");

        Bath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/Bath4.png"))); // NOI18N
        Bath.setPreferredSize(new java.awt.Dimension(115, 105));
        Bath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BathActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel23.setText("Rs.200");

        BathQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BathQ.setText("0");

        Soup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodItems/Soup.png"))); // NOI18N
        Soup.setPreferredSize(new java.awt.Dimension(115, 105));
        Soup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoupActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel30.setText("Rs.200");

        SoupQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SoupQ.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MRL, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(MRLQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MRH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MRHQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CRL, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CRLQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CRH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CRHQ))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MKL, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MKLQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MKH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MKHQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CKL, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CKLQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CKH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CKHQ))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHKL, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CHKLQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHKH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CHKHQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Soup, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SoupQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bath, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BathQ)))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MRL, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MRLQ)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MRH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MRHQ)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CRL, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CRLQ)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CRH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CRHQ)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MKL, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MKLQ)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MKH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MKHQ)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CKL, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CKLQ)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CKH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CKHQ)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CHKL, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHKLQ)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CHKH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHKHQ)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bath, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BathQ)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Soup, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoupQ)
                            .addComponent(jLabel30))))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        BillTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        BillTable.setRowHeight(25);
        jScrollPane1.setViewportView(BillTable);

        lblBill.setEditable(false);
        lblBill.setColumns(20);
        lblBill.setRows(5);
        jScrollPane2.setViewportView(lblBill);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel25.setText("Balance  : ");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel26.setText("Cash  :");

        lblBalance.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lblBalance.setText("00.00");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel28.setText("Total  : ");

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lblTotal.setText("00.00");

        txtCash.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashKeyPressed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 255, 0));
        btnPrint.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 0));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnPay.setBackground(new java.awt.Color(51, 51, 255));
        btnPay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPay.setText("Pay");

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("Cancel");

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel25)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(lblBalance))
                .addGap(64, 64, 64))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Database");

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("View");

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Remove");

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("Stock");

        jButton6.setBackground(new java.awt.Color(102, 204, 255));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("Inventory");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 204, 255));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("Button");

        jButton8.setBackground(new java.awt.Color(102, 204, 255));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setText("Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRLActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MRLQ.getText());
        ++i;
        MRLQ.setText(String.valueOf(i));
        
        addTable("MRL", "Mixed Rice (L)", i, 1500.00);
        calculate();
    }//GEN-LAST:event_MRLActionPerformed

    private void MRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRHActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MRHQ.getText());
        ++i;
        MRHQ.setText(String.valueOf(i));
        
        addTable("MRH", "Mixed Rice (H)", i, 1200.00);
        calculate();
    }//GEN-LAST:event_MRHActionPerformed

    private void CRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRLActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CRLQ.getText());
        ++i;
        CRLQ.setText(String.valueOf(i));
        
        addTable("CRL", "Chicken Rice (L)", i, 1200.00);
        calculate();
    }//GEN-LAST:event_CRLActionPerformed

    private void CRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRHActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CRHQ.getText());
        ++i;
        CRHQ.setText(String.valueOf(i));
        
        addTable("CRH", "Chicken Rice (H)", i, 1000.00);
        calculate();
    }//GEN-LAST:event_CRHActionPerformed

    private void MKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKLActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MKLQ.getText());
        ++i;
        MKLQ.setText(String.valueOf(i));
        
        addTable("MKL", "Mixed Kottu (L)", i, 1300.00);
        calculate();
    }//GEN-LAST:event_MKLActionPerformed

    private void MKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKHActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(MKHQ.getText());
        ++i;
        MKHQ.setText(String.valueOf(i));
       
        addTable("MKH", "Mixed Kottu (H)", i, 1000.00);
        calculate();
    }//GEN-LAST:event_MKHActionPerformed

    private void CKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CKLActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CKLQ.getText());
        ++i;
        CKLQ.setText(String.valueOf(i));
        
        addTable("CKL", "Chiken Kottu (L)", i, 1000.00);
        calculate();
    }//GEN-LAST:event_CKLActionPerformed

    private void CKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CKHActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CKHQ.getText());
        ++i;
        CKHQ.setText(String.valueOf(i));
        
        addTable("CKH", "Chiken Kottu (H)", i, 500.00);
        calculate();
    }//GEN-LAST:event_CKHActionPerformed

    private void CHKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHKLActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CHKLQ.getText());
        ++i;
        CHKLQ.setText(String.valueOf(i));
        
        addTable("CHKL", "Cheese Kottu (L)", i, 1700.00);
        calculate();
    }//GEN-LAST:event_CHKLActionPerformed

    private void CHKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHKHActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(CHKHQ.getText());
        ++i;
        CHKHQ.setText(String.valueOf(i));
        
        addTable("CHKH", "Cheese Kottu (H)", i, 1400.00);
        calculate();
    }//GEN-LAST:event_CHKHActionPerformed

    private void BathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BathActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(BathQ.getText());
        ++i;
        BathQ.setText(String.valueOf(i));
        
        addTable("RC", "Rice & Curry", i, 250.00);
        calculate();
    }//GEN-LAST:event_BathActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        // TODO add your handling code here:
              
        
    }//GEN-LAST:event_txtCashActionPerformed

    private void SoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoupActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(SoupQ.getText());
        ++i;
        SoupQ.setText(String.valueOf(i));
        
        addTable("S1", "Soup", i, 200.00);
        calculate();
    }//GEN-LAST:event_SoupActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) BillTable.getModel();
    
        // Get the selected row index
        int selectedRow = BillTable.getSelectedRow();
        if (selectedRow == -1) { // No row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the price of the item in the selected row (column 3)
        double itemPrice = Double.parseDouble(BillTable.getValueAt(selectedRow, 3).toString());

        // Remove the selected row
        String itemId = BillTable.getValueAt(selectedRow, 0).toString(); // Get item ID before removing the row
        dt.removeRow(selectedRow);

        // Update the total
        double currentTotal = Double.parseDouble(lblTotal.getText());
        double updatedTotal = currentTotal - itemPrice;
        DecimalFormat df = new DecimalFormat("00.00");
        lblTotal.setText(df.format(updatedTotal));

        // Reset the corresponding quantity field
        switch(itemId) {
            case "MRL":
                MRLQ.setText("0");
                break;
            case "MRH":
                MRHQ.setText("0");
                break;
            case "CRL":
                CRLQ.setText("0");
                break;
            case "CRH":
                CRHQ.setText("0");
                break;
            case "MKL":
                MKLQ.setText("0");
                break;
            case "MKH":
                MKHQ.setText("0");
                break;
            case "CKL":
                CKLQ.setText("0");
                break;
            case "CKH":
                CKHQ.setText("0");
                break;
            case "CHKL":
                CHKLQ.setText("0");
                break;
            case "CHKH":
                CHKHQ.setText("0");
                break;
            case "Soup":
                SoupQ.setText("0");
                break;
            case "Bath":
                BathQ.setText("0");
                break;
            default:
                System.out.println("Over");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyPressed

    }//GEN-LAST:event_txtCashKeyPressed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        try {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);
            lblBill.setText("\n");
            lblBill.setText(lblBill.getText() + "                        Prashansa Caters\n");
            lblBill.setText(lblBill.getText() + "         Kandathoduwawa, Madurankuliya\n");
            lblBill.setText(lblBill.getText() + "                        TEL : 0770610065\n");
            lblBill.setText(lblBill.getText() + " ---------------------------------------------------------\n");
            lblBill.setText(lblBill.getText() + "   Order No : 143       " + formattedDateTime + "\n");
            lblBill.setText(lblBill.getText() + " ---------------------------------------------------------\n");
            lblBill.setText(lblBill.getText() + "   Item\t Qty \t Total" + "\n");
            lblBill.setText(lblBill.getText() + " ---------------------------------------------------------\n");

            // Create a DecimalFormat instance for formatting double values
            DecimalFormat df2 = new DecimalFormat("0.00");

            DefaultTableModel df = (DefaultTableModel) BillTable.getModel();

            for (int i = 0; i < BillTable.getRowCount(); i++) {
                // Get values and convert to appropriate data types
                String Name = df.getValueAt(i, 1).toString();
                int Qty = Integer.parseInt(df.getValueAt(i, 2).toString());
                double Price = Double.parseDouble(df.getValueAt(i, 3).toString());

                // Check for division by zero
                double TotalPrice = (Qty != 0) ? Price / Qty : 0;

                // Format double values to two decimal points
                String formattedTotalPrice = df2.format(TotalPrice);
                String formattedPrice = df2.format(Price);
                
                // Append details to lblBill
                lblBill.setText(lblBill.getText() + "   " + Name + "\n" + "                " + Qty + "  * " + "\t" + formattedTotalPrice + "\t" + formattedPrice + "\n");
                                
            }
            lblBill.setText(lblBill.getText() + " ***********************************************\n");
            lblBill.setText(lblBill.getText()+ "   Total " + "\t\t" + lblTotal.getText() + "\n");
            //lblBill.setText(lblBill.getText() + " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            lblBill.setText(lblBill.getText()+ "   Cash " + "\t\t" + txtCash.getText() + "\n");
            lblBill.setText(lblBill.getText()+ "   Balance " + "\t\t" + lblBalance.getText() + "\n");
            lblBill.setText(lblBill.getText() + " ***********************************************\n");
            lblBill.setText(lblBill.getText() + "                             THANK YOU!\n");
            lblBill.setText(lblBill.getText() + " ***********************************************\n");
            lblBill.setText(lblBill.getText() + "        Software by Meshan - 0764315233\n");
            
            lblBill.print(); 
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        MRLQ.setText("0");
        MRHQ.setText("0");
        CRLQ.setText("0");
        CRHQ.setText("0");
        MKLQ.setText("0");
        MKHQ.setText("0");
        CKLQ.setText("0");
        CKHQ.setText("0");
        CHKLQ.setText("0");
        CHKHQ.setText("0");
        SoupQ.setText("0");
        BathQ.setText("0");
        
        DefaultTableModel df = (DefaultTableModel) BillTable.getModel();
        df.setRowCount(0);
        
        lblBill.setText("");
        lblTotal.setText("00.00");
        txtCash.setText("");
        lblBalance.setText("00.00");
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bath;
    private javax.swing.JLabel BathQ;
    private javax.swing.JTable BillTable;
    private javax.swing.JButton CHKH;
    private javax.swing.JLabel CHKHQ;
    private javax.swing.JButton CHKL;
    private javax.swing.JLabel CHKLQ;
    private javax.swing.JButton CKH;
    private javax.swing.JLabel CKHQ;
    private javax.swing.JButton CKL;
    private javax.swing.JLabel CKLQ;
    private javax.swing.JButton CRH;
    private javax.swing.JLabel CRHQ;
    private javax.swing.JButton CRL;
    private javax.swing.JLabel CRLQ;
    private javax.swing.JButton MKH;
    private javax.swing.JLabel MKHQ;
    private javax.swing.JButton MKL;
    private javax.swing.JLabel MKLQ;
    private javax.swing.JButton MRH;
    private javax.swing.JLabel MRHQ;
    private javax.swing.JButton MRL;
    private javax.swing.JLabel MRLQ;
    private javax.swing.JButton Soup;
    private javax.swing.JLabel SoupQ;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JTextArea lblBill;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCash;
    // End of variables declaration//GEN-END:variables
}
