/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ProviderController;
import modelo.Provider;
import modelo.ProviderDAO;

/**
 *
 * @author Natsu98fx
 */
public class VistaProveedores extends javax.swing.JPanel {

    Provider pro = new Provider();
    ProviderDAO proDAO = new ProviderDAO();
    
    
    public VistaProveedores() {
        initComponents();
        
        ProviderController prov = new ProviderController(pro,proDAO,this);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUpMenuProvider = new rojerusan.RSPopuMenu();
        MenuItemEliminarProveedor = new javax.swing.JMenuItem();
        MenuItemReingresarProveedor = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        pnlGeneral = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        rSPanelMaterialGradient1 = new RSMaterialComponent.RSPanelMaterialGradient();
        jLabel1 = new javax.swing.JLabel();
        pnlSlider = new newscomponents.RSPanelEffect();
        txtSearchProvider = new RSMaterialComponent.RSTextFieldIconOne();
        txtRucProvider = new RSMaterialComponent.RSTextFieldOne();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProviders = new rojerusan.RSTableMetro();
        btnNewProvider = new newscomponents.RSButtonGradientIcon_new();
        btnRegisterProvider = new newscomponents.RSButtonGradientIcon_new();
        btnModifyProvider = new newscomponents.RSButtonGradientIcon_new();
        txtIdProvider = new RSMaterialComponent.RSTextFieldOne();
        txtAddressProvider = new RSMaterialComponent.RSTextFieldOne();
        jLabel4 = new javax.swing.JLabel();
        txtNameProvider = new RSMaterialComponent.RSTextFieldOne();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneProvider = new RSMaterialComponent.RSTextFieldOne();
        jLabel6 = new javax.swing.JLabel();
        txtEmailProvider = new RSMaterialComponent.RSTextFieldOne();
        jLabel7 = new javax.swing.JLabel();

        MenuItemEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        MenuItemEliminarProveedor.setText("Eliminar");
        MenuItemEliminarProveedor.setToolTipText("");
        PopUpMenuProvider.add(MenuItemEliminarProveedor);

        MenuItemReingresarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresar.png"))); // NOI18N
        MenuItemReingresarProveedor.setText("Reingresar");
        PopUpMenuProvider.add(MenuItemReingresarProveedor);

        jPanel4.setMaximumSize(new java.awt.Dimension(995, 702));

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setMaximumSize(new java.awt.Dimension(995, 702));

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 153)));

        rSPanelMaterialGradient1.setBgShade(new java.awt.Color(51, 102, 255));
        rSPanelMaterialGradient1.setColorPrimario(new java.awt.Color(0, 102, 255));
        rSPanelMaterialGradient1.setShadowBottom(false);
        rSPanelMaterialGradient1.setShadowLeft(false);
        rSPanelMaterialGradient1.setShadowRight(false);
        rSPanelMaterialGradient1.setShadowTop(false);

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Módulo de Proveedores");

        javax.swing.GroupLayout rSPanelMaterialGradient1Layout = new javax.swing.GroupLayout(rSPanelMaterialGradient1);
        rSPanelMaterialGradient1.setLayout(rSPanelMaterialGradient1Layout);
        rSPanelMaterialGradient1Layout.setHorizontalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterialGradient1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelMaterialGradient1Layout.setVerticalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchProvider.setForeground(new java.awt.Color(51, 51, 51));
        txtSearchProvider.setBorderColor(new java.awt.Color(204, 204, 204));
        txtSearchProvider.setColorIcon(new java.awt.Color(51, 51, 51));
        txtSearchProvider.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtSearchProvider.setPhColor(new java.awt.Color(102, 102, 102));
        txtSearchProvider.setPlaceholder("Buscar");

        txtRucProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtRucProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtRucProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtRucProvider.setOpaque(false);
        txtRucProvider.setPhColor(new java.awt.Color(0, 0, 153));
        txtRucProvider.setPlaceholder("Ingresar RUC...");
        txtRucProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RUC*");

        tblProviders.setBackground(new java.awt.Color(255, 255, 255));
        tblProviders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "RUC", "Nombre", "Teléfono", "Email", "Razón Social", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProviders.setBackgoundHover(new java.awt.Color(102, 255, 255));
        tblProviders.setComponentPopupMenu(PopUpMenuProvider);
        tblProviders.setEditingColumn(0);
        tblProviders.setEditingRow(0);
        tblProviders.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tblProviders.setWidthBorderRows(0);
        jScrollPane1.setViewportView(tblProviders);

        btnNewProvider.setBackground(new java.awt.Color(0, 255, 51));
        btnNewProvider.setText("Nuevo");
        btnNewProvider.setToolTipText("");
        btnNewProvider.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnNewProvider.setColorPrimarioHover(new java.awt.Color(0, 255, 0));
        btnNewProvider.setColorSecundario(new java.awt.Color(0, 102, 51));
        btnNewProvider.setColorSecundarioHover(new java.awt.Color(0, 255, 0));
        btnNewProvider.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);

        btnRegisterProvider.setBackground(new java.awt.Color(75, 172, 198));
        btnRegisterProvider.setText("Registrar");
        btnRegisterProvider.setToolTipText("");
        btnRegisterProvider.setColorPrimario(new java.awt.Color(75, 172, 198));
        btnRegisterProvider.setColorPrimarioHover(new java.awt.Color(0, 255, 255));
        btnRegisterProvider.setColorSecundario(new java.awt.Color(75, 85, 215));
        btnRegisterProvider.setColorSecundarioHover(new java.awt.Color(0, 255, 255));
        btnRegisterProvider.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEND);

        btnModifyProvider.setBackground(new java.awt.Color(0, 255, 51));
        btnModifyProvider.setText("Modificar");
        btnModifyProvider.setToolTipText("");
        btnModifyProvider.setColorPrimario(new java.awt.Color(255, 102, 102));
        btnModifyProvider.setColorPrimarioHover(new java.awt.Color(255, 0, 0));
        btnModifyProvider.setColorSecundario(new java.awt.Color(204, 0, 51));
        btnModifyProvider.setColorSecundarioHover(new java.awt.Color(255, 0, 0));
        btnModifyProvider.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);

        txtIdProvider.setBackground(new java.awt.Color(204, 204, 204));
        txtIdProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtIdProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtIdProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtIdProvider.setOpaque(false);
        txtIdProvider.setPhColor(new java.awt.Color(0, 0, 0));
        txtIdProvider.setPlaceholder("Id Proveedor");
        txtIdProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        txtAddressProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtAddressProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtAddressProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtAddressProvider.setOpaque(false);
        txtAddressProvider.setPhColor(new java.awt.Color(0, 0, 153));
        txtAddressProvider.setPlaceholder("Ingresar Razón Social...");
        txtAddressProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Razón social*");

        txtNameProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtNameProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtNameProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtNameProvider.setOpaque(false);
        txtNameProvider.setPhColor(new java.awt.Color(0, 0, 153));
        txtNameProvider.setPlaceholder("Ingresar Nombres...");
        txtNameProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre*");

        txtPhoneProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtPhoneProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtPhoneProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtPhoneProvider.setOpaque(false);
        txtPhoneProvider.setPhColor(new java.awt.Color(0, 0, 153));
        txtPhoneProvider.setPlaceholder("Ingresar Teléfono...");
        txtPhoneProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono*");

        txtEmailProvider.setForeground(new java.awt.Color(0, 102, 255));
        txtEmailProvider.setBorderColor(new java.awt.Color(0, 102, 255));
        txtEmailProvider.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtEmailProvider.setOpaque(false);
        txtEmailProvider.setPhColor(new java.awt.Color(0, 0, 153));
        txtEmailProvider.setPlaceholder("Ingresar email...");
        txtEmailProvider.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email*");

        javax.swing.GroupLayout pnlSliderLayout = new javax.swing.GroupLayout(pnlSlider);
        pnlSlider.setLayout(pnlSliderLayout);
        pnlSliderLayout.setHorizontalGroup(
            pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSliderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSliderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlSliderLayout.createSequentialGroup()
                                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmailProvider, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIdProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAddressProvider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlSliderLayout.createSequentialGroup()
                                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRucProvider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNameProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhoneProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSliderLayout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(btnNewProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRegisterProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnModifyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        pnlSliderLayout.setVerticalGroup(
            pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSliderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRucProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem MenuItemEliminarProveedor;
    public javax.swing.JMenuItem MenuItemReingresarProveedor;
    public rojerusan.RSPopuMenu PopUpMenuProvider;
    public newscomponents.RSButtonGradientIcon_new btnModifyProvider;
    public newscomponents.RSButtonGradientIcon_new btnNewProvider;
    public newscomponents.RSButtonGradientIcon_new btnRegisterProvider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlGeneral;
    private newscomponents.RSPanelEffect pnlSlider;
    private javax.swing.JPanel pnlTitulo;
    private RSMaterialComponent.RSPanelMaterialGradient rSPanelMaterialGradient1;
    public rojerusan.RSTableMetro tblProviders;
    public RSMaterialComponent.RSTextFieldOne txtAddressProvider;
    public RSMaterialComponent.RSTextFieldOne txtEmailProvider;
    public RSMaterialComponent.RSTextFieldOne txtIdProvider;
    public RSMaterialComponent.RSTextFieldOne txtNameProvider;
    public RSMaterialComponent.RSTextFieldOne txtPhoneProvider;
    public RSMaterialComponent.RSTextFieldOne txtRucProvider;
    public RSMaterialComponent.RSTextFieldIconOne txtSearchProvider;
    // End of variables declaration//GEN-END:variables
}
