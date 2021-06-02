package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class alumni_detailAct extends AppCompatActivity {
    ListView list_mhs
     ,list_no
    ,list_judul
    ,list_pembimbing
    ,list_tgl
    ,list_ipk
    ,list_email;
    LinearLayout btn_back_home;
    String[] angka = {
            "1","\n"+"2"+"\n","\n"+"3"+"\n","\n"+"4"+"\n","\n"+"5"+"\n\n","6","7","\n"+"8"+"\n\n","\n"+"9"+"\n\n",
            "\n\n"+"10"+"\n\n", "11","\n\n"+"12"+"\n\n\n","\n"+"13"+"\n\n","14","\n\n"+"15"+"\n","\n\n"+"16"+"\n\n\n",
            "17","\n"+"18"+"\n","19","\n"+"20"+"\n", "\n"+"21"+"\n","\n"+"22"+"\n","\n"+"23"+"\n","\n"+"24"+"\n\n",
            "\n"+"25"+"\n\n","\n\n"+"26"+"\n\n\n","\n"+"27"+"\n\n","\n"+"28"+"\n\n","\n"+"29"+"\n","\n"+"30"+"\n",
            "\n\n","\n\n","\n\n",
    };
    String[] mhs = {
            "Robby Setiawan"+"\n" + "140910150031",
            "Septian Ari Kurniawan"+"\n" + "140910150030"+"\n" ,
            "Irfan Abiwaluya Rachmat"+"\n" + "140910150012"+"\n",
            "Muhammad Ega"+"\n" + "140910150018"+"\n",
            "\n"+"Gelardo Benjamin Manik"+"\n" + "140910150008"+"\n",
            "Ikhsan Nurdianis"+"\n" + "140910150002",
            "Reza Andika Setyadi"+"\n" + "140910150020",
            "\n"+"Raynaldo Mathew Kadir"+"\n" + "140910150016"+"\n",
            "\n"+"Marmoyo Bariqi L"+"\n" + "140910150003"+"\n",
            "\n"+"Muhammad Reza"+"\n" + "140910150023"+"\n\n",
            "R. Muhammad Pradipta H"+"\n" + "140910150006",
            "\n\n"+"Muhammad Fachry H"+"\n" + "140910150010"+"\n\n",
            "\n"+"Fawwaz Amjad Fuadi"+"\n" + "140910150035"+"\n",
            "Prayuda Dwiantama "+"\n" + "140910150028",
            "\n"+"Aldi Wista Fadhillah"+"\n" + "140910150025"+"\n",
            "\n\n"+"Aldo Wista Fadhilah"+"\n" + "140910150024"+ "\n\n",
            "Faatih Rifqi Muqaffi"+"\n" + "140910150021",
            "Ariffadhlurrohman R"+"\n" + "140910150007"+"\n",
            "Panji Ibnu Abdillah"+"\n" + "140910150015",
            "Aldino Herdianto"+"\n" + "140910150022"+"\n",
            "Muhammad Fachri Akbar"+"\n" + "140910150033"+"\n",
            "Muhammad Ilham Pratama"+"\n" + "140910150034",
            "Primadifa Thayib Noor D"+"\n" + "140910160002"+"\n",
            "\n"+"Dendi Hazik Fuadi"+"\n" + "140910160005"+"\n",
            "\n"+"Salsabila Tsany Bahy"+"\n" + "140910160011"+"\n",
            "\n\n"+"Muhammad Fauzi N"+"\n" + "140910160040"+"\n\n",
            "\n"+"Oki Mochammad F"+"\n" + "140910160046"+"\n",
            "\n"+"Widya Laelani Rizki"+"\n" + "140910150005"+"\n",
            "Muhammad Ahsin R"+"\n" + "140910150017"+"\n",
            "Mochammad Iman Fahri "+"\n" + "140910150027"+"\n",
            "\n\n","\n\n","\n\n",





    };
    String[] judul ={
            "Rancang bangun Alat Pengukur dan Perbaikan" + "\n" + "Faktor Daya Listrik untuk Konsumen Rumahan",
            "Rancang bangun Solar Tracker Sumbu" + "\n" + "Tunggal Berbasis Motor Stepper dan " + "\n" + "Real Time Clock",
            "Pemodelan, Simulasi dan Analisis Rugi daya"+ "\n" + "Sistem Distribusi 20 KV pada Penyulang UTM" + "\n" + "menggunakan Software Etap",
            "Simulasi dan Analisis Hubung Singkat pada" + "\n" + "Jaringan Tegangan Menengah 20 KV dengan" + "\n" + "menggunakan Software ETAP",
            "ANALISIS ALIRAN DAYA PADA SISTEM" + "\n" + "TENAGA LISTRIK 150KV SUBSISTEM" + "\n" + "BANDUNG SELATAN MENGGUNAKAN" + "\n" + "SOFWARE ETAP",
            "Perancangan dan Fabrikasi Sistem Complex" + "\n" + "Impedance Analyzer berbasis Chipset AD5933",
            "OPTIMALISASI PENGGUNAAN LAMPU LED" + "\n" + "RUANGAN BERBASIS ARDUINO",
            "Desain dan Implementasi Solar Cell Tracker" + "\n" + "Dua Sumbu pada Solar Panel Menggunakan" + "\n" + "Servo Berbasis Arduino dengan Feedback" + "\n" + "Control System",
            "ANALISIS KESTABILAN TEGANGAN PADA" + "\n" + "SALURAN TRANSMISI MENGGUNAKAN FAST" + "\n" + "VOLSTAGE STABILITY INDEX DAN LINE" + "\n" + "STABILITY FACTOR",
            "ANALISIS KEBUTUHAN KAPASITOR BANK" + "\n" + "TERHADAP BESARNY FAKTOR DAYA AKIBAT" + "\n" + "PENGGUNAAN BEBAN SEHARI-HARI PADA" + "\n" + "GEDUNG KEMENTRIAN BIDANG" + "\n" + "PEREKONOMIAN REPUBLIK INDONESIA",
            "PEMBUATAN PROTIPE PEMBANGKIT" + "\n" + "LISTRIK PORTABEL TENAGA SURYA DAN BAYU",
            "DATA LOGGER BERBASIS" + "\n" + "MICROCONTROLLER ATMEGA 2560 UNTUK" + "\n" + "MENCARI PENGARUH RADIASI MATAHARI" + "\n" + "DAN SUHU PERMUKAAN PANEL SURYA" + "\n" + "TERHADAP ARUS DAN TEGANGAN PADA" + "\n" + "SISTEM TRACKING SOLAR CELL",
            "Alat Monitoring Tegangan dan Arus pada" + "\n" + "Baterai Valve – Regulated Lead-Acod (URLA)" + "\n" + "saat kondisi Discharging menggunakan" + "\n" + "Arduino",
            "Generator Pulsa Spike Tegangan Tinggi" + "\n" + "Berbasis MOSFET",
            "Rancang Bangun Perangkat Keamanan" + "\n" + "dengan Konsep Biometric Verification " + "\n" + "System berbasiskan Internet Of Things " + "\n" + "menggunakan RASPBERRY PI",
            "RANCANG BANGUN SMART LIGTHING" + "\n" + "SEBAGAI SISTEM KONTROL DAN" + "\n" + "MONITORING LAMPU PENERANGAN JALAN" + "\n" + "UMUM BERBASISKAN INTERNET OF THINGS" + "\n" + "(IOT) DENGAN MENGGUNAKAN PROTOKOL" + "\n" + "LORA",
            "Generator Pulsa Orde Nanodetik Terprogram" + "\n",
            "Rancang Bangun Kendaraan Tanpa Awak Tipe" + "\n" + "Darat dan Pengontrolan dengan " + "\n" + "Menggunakan Metode Waypoints",
            "Analisis Konfigurasi Relay Arus Lebih" + "\n" + " di Trafo 5 Gardu Induk Bandung Utara",
            "Perancangan dan Fabrikasi Tegangan Tinggi" + "\n" + "DC sebagai Generator Picu Transduser" + "\n" + "Ultrasonik Menggunakan Metode Switching",
            "Rancang Bangun Perangkat Monitoring" + "\n" + "Multisensor berbasiskan Internet of Things" + "\n" + "menggunakan NodeMCU",
            "Rancang Bangun Sistem Kontrol dan" + "\n" + "Monitoring Kelembaban Ruang Pusat Data PT." + "\n" + "Krakatau Steel Berbasis Internet of Things",
            "RANCANG BANGUN SISTEM PARKIR DENGAN" + "\n" + "INFORMASI KETERSEDIAAN LOKASI PARKIR" + "\n" + "PADA GEDUNG PARKIR UMUM",
            "RANCANG BANGUN ROBOT ASISTEN" + "\n" + "INTERAKSI SOSIAL MENGGUNAKAN DETEKS" + "\n" + "OBJEK DAN PENGENALAN WAJAH BERBASIS" + "\n" + "INTERNET OF THINGS",
            "INVESTIGASI KORELASI ANTARA" + "\n" + "PARAMETER RAMBATAN GELOMBANG" + "\n" + "ULTRASONIK TERHADAP POROSITAS" + "\n" + "MEDIUM",
            "RANCANG BANGUN WIRELESS SENSOR" + "\n" + "NETWORK (WSN) BERBASIS" + "\n" + "MIKROKONTROLER UNTUK PEMANTAUAN" + "\n" + "DAN PREDICTIVE MAINTENANCE LAMPU" + "\n" + "SINYAL PADA PERSINYALAN KERETA API" + "\n" + "INDONESIA",
            "Rancang Bangun Sistem Parkir Dengan" + "\n" + "Menggunakan RFID Dan Informasi" + "\n" + "Ketersediaan Parkir Berbasiskan Internet Of" + "\n" + "Things",
            "PERANCANGAN ALAT DETEKSI WARNA" + "\n" + "MENGGUNAKAN TCS3200 DAN RASPBERRY" + "\n" + "PI SEBAGAI BANTUAN BAGI PENDERITA" + "\n" + "BUTA WARNA",
            "PERANGKAT LUNAK ANTAR MUKA SISTEM" + "\n" + "PENGUKURAN IMPEDANSI KOMPLEKS" + "\n"+ "BERBASIS MODUL AD5933",
            "Simulasi Model Penerapan Overcurrent Relay" + "\n" + "(OCR) Digital pada Electric Arc Furnace Slab" + "\n" + "Steel Plant PT Krakatau Steel Tbk. (Persero)",
            "\n\n","\n\n","\n\n",
    };
    String[] pembimbing ={
            "Emilliano, M.T., Ph.D." + "\n" + "Drs. Nendi Suhendi Syafei, MS.",
            "Dr. Mohammad Taufik, M.Si." + "\n" + "Emilliano, M.T., Ph.D."+ "\n",
            "Dr. Mohammad Taufik, M.Si." + "\n" + "Drs. Nendi Suhendi Syafei, MS."+"\n",
            "Dr. Mohammad Taufik, M.Si." + "\n" + "Emilliano, M.T., Ph.D."+"\n",
            "\n"+"Dr. Mohammad Taufik, M.Si." + "\n" + "Drs. Nendi Suhendi Syafei, MS"+"\n",
            "Dr. Darmawan Hidayat, MT." + "\n" + "Drs. Nendi Suhendi Syafei, MS.",
            "Dr. Bambang Mukti Wibawa, MS" + "\n" + "Dr. Darmawan Hidayat, MT",
            "\n"+"Emilliano, M.T., Ph.D." + "\n" + "Dr. Mohammad Taufik, M.Si."+"\n",
            "\n"+"Dr. Mohammad Taufik, M.Si" + "\n" + "Dr. Bambang Mukti Wibawa, MS"+"\n",
            "\n"+"Emilliano, M.T., Ph.D." + "\n" + "Dr. Darmawan Hidayat, MT"+"\n\n",

            "Dr. Mohammad Taufik, M.Si." + "\n" + "Emilliano, M.T., Ph.D.",
            "\n\n"+"Emilliano, M.T., Ph.D." + "\n" + "Dr. Mohammad Taufik, M.Si"+"\n\n",
            "\n"+"Emilliano, M.T., Ph.D." + "\n" + "Dr. Mohammad Taufik, M.Si."+"\n",
            "Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Bambang Mukti Wibawa, MS",
            "\n"+"Dessy Novita, MT., Ph.D." + "\n" + "Emilliano, M.T., Ph.D."+"\n",
            "\n\n"+"Dessy Novita, MT., Ph.D" + "\n" + "Emilliano, M.T., Ph.D."+"\n\n",
            "Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Bambang Mukti Wibawa, MS",
            "Dessy Novita, MT., Ph.D." + "\n" + "Emilliano, M.T., Ph.D."+"\n",
            "Dr. Bambang Mukti Wibawa, MS." + "\n" + "Drs. Nendi Suhendi Syafei, MS.",
            "Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Bambang Mukti Wibawa, MS"+"\n",

            "Dr. Bambang Mukti Wibawa, MS" + "\n" + "Dr. Darmawan Hidayat, MT"+"\n",
            "Dessy Novita, MT., Ph.D." + "\n" + "Dr. Darmawan Hidayat, MT"+"\n",
            "Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Bambang Mukti Wibawa, MS"+"\n",
            "\n"+"Dessy Novita, MT., Ph.D." + "\n" + "Dr. Mohammad Taufik, M.Si."+"\n",
            "\n"+"Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Mohammad Taufik, M.Si"+"\n",
            "\n\n"+"Dr. Bambang Mukti Wibawa, MS" + "\n" + "Dr. Mohammad Taufik, M.Si."+"\n\n",
            "\n"+"Dr. Darmawan Hidayat, MT" + "\n" + "Drs. Nendi Suhendi Syafei, MS."+"\n",
            "\n"+"Dr. Bambang Mukti Wibawa, MS" + "\n" + "Dessy Novita, MT., Ph.D."+"\n",
            "Dr. Darmawan Hidayat, MT" + "\n" + "Dr. Bambang Mukti Wibawa, MS"+"\n",
            "Dessy Novita, MT., Ph.D." + "\n" + "Dr. Mohammad Taufik M.Si."+"\n",
            "\n\n","\n\n","\n\n",

    };
    String[] tgl ={
            "26 Februari 2019","\n"+"26 Februari 2019"+"\n","\n"+"26 Februari 2019"+"\n","\n"+"26 Februari 2019"+"\n","\n"+"26 Februari 2019"+"\n\n",
            "27 Maret 2019","27 Maret 2019","\n"+"27 Maret 2019"+"\n\n","\n"+"26 Februari 2019"+"\n\n",
            "\n\n"+"20 Maret 1997"+"\n\n", "13 Juni 2019","\n\n"+"13 Juni 2019"+"\n\n\n","\n"+"13 Juni 2019"+"\n\n","13 Juni 2019","\n\n"+"05 Juli 2019"+"\n",
            "\n\n"+"05 Juli 2019"+"\n\n\n", "05 Juli 2019","\n"+"08 Agustus 2019"+"\n","08 Agustus 2019","\n"+"08 Agustus 2019"+"\n", "\n"+"08 Agustus 2019"+"\n",
            "\n"+"08 Agustus 2019"+"\n","\n"+"09 Januari 2020"+"\n","\n"+"09 Januari 2020"+"\n\n", "\n"+"09 Januari 2020"+"\n\n",
            "\n\n"+"09 Januari 2020"+"\n\n\n","\n"+"09 Januari 2020"+"\n\n","\n"+"10 Januari 2020"+"\n\n","\n"+"10 Januari 2020"+"\n","\n"+"10 Januari 2020"+"\n",
            "\n\n","\n\n","\n\n",
    };
    String[] ipk ={
            "3,55","\n"+"3,66"+"\n","\n"+"3,22"+"\n","\n"+"3,42"+"\n","\n"+"3,63"+"\n\n","3,63","3,45","\n"+"3,59"+"\n\n",
            "\n"+"3,48"+"\n\n", "\n\n"+"3,33"+"\n\n", "3,33","\n\n"+"3,33"+"\n\n\n","\n"+"3,34"+"\n\n","3,50","\n\n"+"3,68"+"\n",
            "\n\n"+"3,54"+"\n\n\n", "3,21","\n"+"3,13"+"\n","3,26","\n"+"3,22"+"\n", "\n"+"3,47"+"\n","\n"+"3,38"+"\n","\n"+"3,65"+"\n","\n"+"3,71"+"\n\n",
            "\n"+"3,40"+"\n\n","\n\n"+"3,77"+"\n\n\n","\n"+"3,36"+"\n\n","\n"+"3,40"+"\n\n","\n"+"3,24"+"\n","\n"+"3,53"+"\n",
            "\n\n","\n\n","\n\n",
    };
    String[] email={
            "capitol12390@gmail.com","\n"+"septian.arikurniawan@gmail.com"+"\n","\n"+"irfanarach@gmail.com"+"\n","\n"+"simatupang.ega@gmail.com"+"\n","\n"+"geraldo.manik.31@gmail.com"+"\n\n",
            "ikhsannurdianis@gmail.com","rezaandika692@gmail.com","\n"+"raynaldo.mathew@gmail.com"+"\n\n", "\n"+"bariqmarmoyo1207@gmail.com"+"\n\n", "\n\n"+"mreza82.24@gmail.com"+"\n\n",
            "pradiptahartawan27@gmail.com","\n\n"+"fachryhusaeni10@gmail.com"+"\n\n\n","\n"+"fawwazaf123@gmail.com"+"\n\n","prydwiantama@gmail.com","\n\n"+"aldiwista@gmail.com"+"\n",
            "\n\n"+"fadhilah.aldo123@gmail.com"+"\n\n\n", "faatihrifqi@gmail.com","\n"+"arfadrohru@gmail.com"+"\n","panjiabdillah@gmail.com","\n"+"-"+"\n", "\n"+"fchrkbr@gmail.com"+"\n",
            "\n"+"pratamailham101@gmail.com"+"\n","\n"+"primadifathayib@gmail.com"+"\n","\n"+"dzikadi6@gmail.com"+"\n\n", "\n"+"tsanybahy20@gmail.com"+"\n\n","\n\n"+"mfauzinuryasin@gmail.com"+"\n\n\n",
            "\n"+"oki.fauzan@gmail.com"+"\n\n","\n"+"widyalaelanir@gmail.com"+"\n\n","\n"+"Ahsinrifae@gmail.com"+"\n","\n"+"iman.fahri@gmail.com"+"\n",
            "\n\n","\n\n","\n\n",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_detail);
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtohome = new Intent(alumni_detailAct.this, activity_home.class);
                startActivity(backtohome);
            }
        });

        list_no = findViewById(R.id.list_no);
        ArrayAdapter <String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, angka);
        list_no.setAdapter(myAdapter);

        list_mhs = findViewById(R.id.list_mhs);
        ArrayAdapter <String> mhsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mhs);
        list_mhs.setAdapter(mhsAdapter);

        list_judul = findViewById(R.id.list_judul);
        ArrayAdapter<String> judulAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, judul);
        list_judul.setAdapter(judulAdapter);

        list_pembimbing = findViewById(R.id.list_pembimbing);
        ArrayAdapter<String> pembimbingAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pembimbing);
        list_pembimbing.setAdapter(pembimbingAdapter);

        list_tgl = findViewById(R.id.list_tgl);
        ArrayAdapter<String> tglAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tgl);
        list_tgl.setAdapter(tglAdapter);

        list_ipk = findViewById(R.id.list_ipk);
        ArrayAdapter<String> ipkAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ipk);
        list_ipk.setAdapter(ipkAdapter);

        list_email = findViewById(R.id.list_email);
        ArrayAdapter<String> emailAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, email);
        list_email.setAdapter(emailAdapter);
    }
}