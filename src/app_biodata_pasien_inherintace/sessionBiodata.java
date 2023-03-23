/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_biodata_pasien_inherintace;

public class sessionBiodata {
    private static String no_rm;
    private static String nama_pasien;
    private static String alamat;
    private static String jenis_kelamin;
    private static String poli_spesialis;
    private static String gol_darah;
    
    // Trick Session : GET & SET
    public static String getno_rm() {
        return no_rm;
    }    
    public static void setno_rm(String no_rm){
        sessionBiodata.no_rm = no_rm;
    }
    
    public static String getnama_pasien() {
        return nama_pasien;
    }    
    public static void setnama_pasien(String nama_pasien){
        sessionBiodata.nama_pasien = nama_pasien;
    }
    
    public static String getalamat() {
        return alamat;
    }    
    public static void setalamat(String alamat){
        sessionBiodata.alamat = alamat;
    }
    
    public static String getjenis_kelamin() {
        return jenis_kelamin;
    }    
    public static void setjenis_kelamin(String jenis_kelamin){
        sessionBiodata.jenis_kelamin = jenis_kelamin;
    }
    
    public static String getpoli_spesialis() {
        return poli_spesialis;
    }    
    public static void setpoli_spesialis(String poli_spesialis){
        sessionBiodata.poli_spesialis = poli_spesialis;
    }
    
    public static String getgol_darah() {
        return gol_darah;
    }    
    public static void setgol_darah(String gol_darah){
        sessionBiodata.gol_darah = gol_darah;
    }
}