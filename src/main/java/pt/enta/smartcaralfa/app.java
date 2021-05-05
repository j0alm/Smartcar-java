/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.enta.smartcaralfa;

import com.google.gson.Gson;
import com.smartcar.sdk.AuthClient;
import com.smartcar.sdk.Vehicle;
import com.smartcar.sdk.data.Auth;
import com.smartcar.sdk.data.SmartcarResponse;
import com.smartcar.sdk.data.VehicleFuel;
import com.smartcar.sdk.data.VehicleIds;
import com.smartcar.sdk.data.VehicleInfo;
import com.smartcar.sdk.data.VehicleLocation;
import com.smartcar.sdk.data.VehicleOdometer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 *
 * @author João Almeida
 */
public class app extends javax.swing.JFrame {

    private static String access;
    private static final Gson gson = new Gson();
    private final AuthClient client;

    /**
     * Creates new form app
     */
    public app() {
        initComponents();

        port(8000);

        String clientId = "e1e6f5cd-f65b-451a-9af1-9e7fef810fc2";
        String clientSecret = "d2d3832c-e1b0-43f2-a196-53592f46ee1c";
        String redirectUri = "http://localhost:8000/callback";
        String[] scope = {"required:read_fuel read_location read_odometer read_vehicle_info read_vin"};
        boolean testMode = true;

        client = new AuthClient(
                clientId,
                clientSecret,
                redirectUri,
                scope,
                testMode
        );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        btnFuel = new javax.swing.JButton();
        btnOdometer = new javax.swing.JButton();
        btnLocation = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartCar");

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        btnFuel.setText("Vehicle Fuel");
        btnFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuelActionPerformed(evt);
            }
        });

        btnOdometer.setText("Vehicle Odometer");
        btnOdometer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdometerActionPerformed(evt);
            }
        });

        btnLocation.setText("Vehicle Location");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });

        btnInfo.setText("Vehicle Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOdometer, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLocation)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFuel)
                    .addComponent(btnOdometer)
                    .addComponent(btnLocation))
                .addGap(18, 18, 18)
                .addComponent(btnInfo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuelActionPerformed
        // TODO add your handling code here:

        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8000/login";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }

        get("/login", (req, res) -> {
            AuthClient.AuthUrlBuilder link = client.authUrlBuilder();
            res.redirect(link.build());
            return null;
        });

        get("/callback", (req, res) -> {
            String code = req.queryMap("code").value();

            Auth auth = client.exchangeCode(code);

            // in a production app you'll want to store this in some kind of persistent storage
            access = auth.getAccessToken();

            return "Thank you for registering!";
        });

        get("/fuel", (req, res) -> {
            String line = "";
            SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
            // the list of vehicle ids
            String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

            String bla = "";
            // instantiate the first vehicle in the vehicle id list
            for (String v : vehicleIds) {
                Vehicle vehicle = new Vehicle(v, access);
                SmartcarResponse<VehicleFuel> response = vehicle.fuel();
                VehicleFuel fuelData = response.getData();
                double fuel = fuelData.getAmountRemaining();
                double fuel1 = fuelData.getRange();
                line = "O carro " + vehicleIds[0] + " ainda tem " + fuel + " litros de combustivel e ainda consegue percorrer " + fuel1 + " kms." ;
                bla = bla + gson.toJson(line);
                System.out.println(gson.toJson(line));

            }

            res.type("application/json");
            resultado.setText(line);
            return gson.toJson(line);

        });
    }//GEN-LAST:event_btnFuelActionPerformed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        // TODO add your handling code here:

        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8000/login";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }

        get("/login", (req, res) -> {
            AuthClient.AuthUrlBuilder link = client.authUrlBuilder();
            res.redirect(link.build());
            return null;
        });

        get("/callback", (req, res) -> {
            String code = req.queryMap("code").value();

            Auth auth = client.exchangeCode(code);

            // in a production app you'll want to store this in some kind of persistent storage
            access = auth.getAccessToken();

            return "Thank you for registering!";
        });

        get("/location", (req, res) -> {
            String line = "";
            SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
            // the list of vehicle ids
            String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

            String bla = "";
            // instantiate the first vehicle in the vehicle id list
            for (String v : vehicleIds) {
                Vehicle vehicle = new Vehicle(v, access);
                SmartcarResponse<VehicleLocation> response = vehicle.location();
                VehicleLocation LocationData = response.getData();
                double location = LocationData.getLatitude();
                double location1 = LocationData.getLongitude();
                line = "O carro " + vehicleIds[0] + " tem de latitude " + location + " e de longitude " + location1;
                bla = bla + gson.toJson(line);
                System.out.println(gson.toJson(line));

            }

            res.type("application/json");
            resultado.setText(line);
            return gson.toJson(line);

        });
    }//GEN-LAST:event_btnLocationActionPerformed

    private void btnOdometerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdometerActionPerformed
        // TODO add your handling code here:

        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8000/login";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }

        get("/login", (req, res) -> {
            AuthClient.AuthUrlBuilder link = client.authUrlBuilder();
            res.redirect(link.build());
            return null;
        });

        get("/callback", (req, res) -> {
            String code = req.queryMap("code").value();

            Auth auth = client.exchangeCode(code);

            // in a production app you'll want to store this in some kind of persistent storage
            access = auth.getAccessToken();

            return "Thank you for registering!";
        });

        get("/odometer", (req, res) -> {
            String line = "";
            SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
            // the list of vehicle ids
            String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

            String bla = "";
            // instantiate the first vehicle in the vehicle id list
            for (String v : vehicleIds) {
                Vehicle vehicle = new Vehicle(v, access);
                SmartcarResponse<VehicleOdometer> response = vehicle.odometer();
                VehicleOdometer odometerData = response.getData();
                double odometer = odometerData.getDistance();
                line = "O carro " + vehicleIds[0] + " tem uma distância de " + odometer + " kms";
                bla = bla + gson.toJson(line);
                System.out.println(gson.toJson(line));

            }

            res.type("application/json");
            resultado.setText(line);
            return gson.toJson(line);

        });
    }//GEN-LAST:event_btnOdometerActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:

        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8000/login";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }

        get("/login", (req, res) -> {
            AuthClient.AuthUrlBuilder link = client.authUrlBuilder();
            res.redirect(link.build());
            return null;
        });

        get("/callback", (req, res) -> {
            String code = req.queryMap("code").value();

            Auth auth = client.exchangeCode(code);

            // in a production app you'll want to store this in some kind of persistent storage
            access = auth.getAccessToken();

            return "Thank you for registering!";
        });

        get("/info", (req, res) -> {
            String line = "";
            SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
            // the list of vehicle ids
            String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

            String bla = "";
            // instantiate the first vehicle in the vehicle id list
            for (String v : vehicleIds) {
                Vehicle vehicle = new Vehicle(v, access);
                VehicleInfo response = vehicle.info();
                String info1 = response.getMake();
                String info2 = response.getModel();
                int info3 = response.getYear();

                line = "O carro com o ID " + vehicleIds[0] + " é da marca " + info1 + " do modelo " + info2 + " do ano de " + info3;
                bla = bla + gson.toJson(line);
                System.out.println(gson.toJson(line));

            }

            res.type("application/json");
            resultado.setText(line);
            return gson.toJson(line);

        });
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnFuel;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnOdometer;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextArea resultado;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
