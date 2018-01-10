/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.idhamrahadian.latihanmvcjdbc.event;

import edu.idhamrahadian.latihanmvcjdbc.entity.Pelanggan;
import edu.idhamrahadian.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Idham Rahadian
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
