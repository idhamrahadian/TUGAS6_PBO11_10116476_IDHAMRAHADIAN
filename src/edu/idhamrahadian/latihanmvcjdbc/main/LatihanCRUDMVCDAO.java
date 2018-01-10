/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.idhamrahadian.latihanmvcjdbc.main;

import com.mysql.jdbc.exceptions.MySQLDataException;
import edu.idhamrahadian.latihanmvcjdbc.database.KingsBarberShopDatabase;
import edu.idhamrahadian.latihanmvcjdbc.entity.Pelanggan;
import edu.idhamrahadian.latihanmvcjdbc.error.PelangganException;
import edu.idhamrahadian.latihanmvcjdbc.service.PelangganDao;
import edu.idhamrahadian.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;



/**
 *
 * @author 
 * NIM  : 10116476
 * NAMA : IDHAM RAHADIAN
 * KELAS: PBO11
 * 
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
