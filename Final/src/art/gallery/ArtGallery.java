/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import java.io.IOException;

/**
 *
 * @author clt
 */

public class ArtGallery {

    /**
     * @param args the command line arguments
     */
    public static load loading = new load();
    public static void main(String[] args) throws IOException {
         loading.load_owner();
         loading.load_customer();
         loading.load_Art();
       form0 f = new form0();
       f.setVisible(true);
    }
    
}
