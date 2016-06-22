package view;

import controller.ControlDePersona;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Persona;

@SuppressWarnings("serial")
public class view extends javax.swing.JFrame {

    ControlDePersona obj;
    public view() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnDNI = new javax.swing.JButton();
        btnNombres = new javax.swing.JButton();
        btnApellidos = new javax.swing.JButton();
        btnSexo = new javax.swing.JButton();
        btnEdad = new javax.swing.JButton();
        btnFechaN = new javax.swing.JButton();
        BotonBuscar1 = new javax.swing.JButton();
        txtNombre = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.setText("Cargar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2.setText("Validar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3.setText("Salir");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnDNI.setText("DNI");
        btnDNI.setContentAreaFilled(false);
        btnDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNIActionPerformed(evt);
            }
        });

        btnNombres.setText("Nombres");
        btnNombres.setBorderPainted(false);
        btnNombres.setContentAreaFilled(false);
        btnNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombresActionPerformed(evt);
            }
        });

        btnApellidos.setText("Apellidos");
        btnApellidos.setBorderPainted(false);
        btnApellidos.setContentAreaFilled(false);
        btnApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApellidosActionPerformed(evt);
            }
        });

        btnSexo.setText("Sexo");
        btnSexo.setBorderPainted(false);
        btnSexo.setContentAreaFilled(false);
        btnSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSexoActionPerformed(evt);
            }
        });

        btnEdad.setText("Edad");
        btnEdad.setBorderPainted(false);
        btnEdad.setContentAreaFilled(false);
        btnEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadActionPerformed(evt);
            }
        });

        btnFechaN.setText("Fecha de Nacimiento");
        btnFechaN.setBorderPainted(false);
        btnFechaN.setContentAreaFilled(false);
        btnFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaNActionPerformed(evt);
            }
        });

        BotonBuscar1.setText("Buscar Archivo");
        BotonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscar1ActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotonBuscar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBuscar1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDNI)
                            .addComponent(btnNombres)
                            .addComponent(btnApellidos)
                            .addComponent(btnSexo)
                            .addComponent(btnEdad)
                            .addComponent(btnFechaN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }

    protected void txtNombreActionPerformed(ActionEvent evt) {
		
	}

	private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if ("".equals(txtNombre.getText())) {
                JOptionPane.showMessageDialog(null, "No hay archivo");
            }else{
                 obj = new ControlDePersona(txtNombre.getText());
                verPersonas();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {
    	
    }

    private void btnDNIActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            obj.OrdenarPorDNI();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "NO IMPLEMENTADO");
    }

    private void btnNombresActionPerformed(java.awt.event.ActionEvent evt) {        
        try {
            obj.OrdenarPorNombres();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnApellidosActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            obj.OrdenarPorApellidos();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    private void btnSexoActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            obj.OrdenarPorSexo();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }

    private void btnEdadActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            obj.OrdenarPorEdad();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }

    private void btnFechaNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            obj.OrdenarPorFecha();
            verPersonas();
        } catch (Exception ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }

    private void BotonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(new FileNameExtensionFilter("*.csv", "csv"));
        int op = dlg.showOpenDialog(this);
        if (op==JFileChooser.APPROVE_OPTION)
        {
            String file = dlg.getSelectedFile().getPath();
            txtNombre.setText(file);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnApellidos;
    private javax.swing.JButton btnDNI;
    private javax.swing.JButton btnEdad;
    private javax.swing.JButton btnFechaN;
    private javax.swing.JButton btnNombres;
    private javax.swing.JButton btnSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private java.awt.TextField txtNombre;

    
    Persona persona;
    public void verPersonas() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
            
        limpiarTabla(table1);
        
        model.setRowCount(0);
        try {
            for (Persona a : obj.PersonaListar()) {     
                Object[] dato = {a.getDni(), a.getNombres(), a.getApellidos(), a.getSexo(), a.getEdad(), a.getFecNac()};
                model.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }
    
    public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
}
