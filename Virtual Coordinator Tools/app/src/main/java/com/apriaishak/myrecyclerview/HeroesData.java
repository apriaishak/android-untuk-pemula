package com.apriaishak.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Presentasi", "Mindomo sangat luar biasa untuk presentasi walau basicnya adalah aplikasi pemetaan pikiran kolaboratif online, pemetaan konsep", "https://1.bp.blogspot.com/-NYhUi_6EV4c/XVLBeKdPMoI/AAAAAAAAA_U/AKkP4PrPnawn1ePQ6O6n46_kwoGJ4kTegCEwYBhgL/s1600/01%2BPresentasi%2B-%2BMindomo.png"},
            {"Meeting Room", "Cisco WebEx adalah sistem komunikasi video conference berbasis interface web yang memungkinkan komunikasi berjalan dengang menggunakan perangkat personal dan mobile seperti PC, laptop, notebook, smartphone, dan PC tablet", "https://1.bp.blogspot.com/-xwQgbrZEypc/XVLQWAJNt6I/AAAAAAAABAM/e9g9Nbup2uM0n1k6UHYItF_n6a7EJ8oHACLcBGAs/s1600/02%2BRoom%2BMeeting%2B-%2BWebex.png"},
            {"Absensi", "Google Formulir dapat digunakan untuk absensi dan berguna untuk membantu anda merencanakan acara, mengirim survei, memberikan siswa atau orang lain kuis, atau mengumpulkan informasi yang mudah dengan cara yang efisien", "https://1.bp.blogspot.com/-KWp9E8LhD5A/XVLTejiOECI/AAAAAAAABAw/tcE-WiJk0GwFC_w1qZvvn1CmipkYBTGaQCLcBGAs/s1600/03%2BAbsensi%2B-%2BGoogle%2BForms.png"},
            {"Flyer", "Buat desain + dokumen yang menarik dengan mudah. Gunakan fitur seret dan taruh serta layout profesional Canva untuk mendesain grafis yang selalu menarik.", "https://1.bp.blogspot.com/-r6swHNTCerY/XVLVV1w6PNI/AAAAAAAABA8/ePDZ9p5BX-wTKbePgTywbeJNwFyuBtc5QCLcBGAs/s1600/04%2BFlyer%2B-%2BCanva.png"},
            {"Illustrasi", "DU Recorder adalah aplikasi yang mampu merekam video apa yang tengah terjadi di layar Android Anda. Bagian terbaiknya yaitu Anda bisa merekam video sekaligus mengeditnya menggunakan alat edit yang telah tersedia di dalam aplikasi", "https://1.bp.blogspot.com/-aybqITe2d2E/XVLXqMAZEyI/AAAAAAAABBU/EuIBrrhe9NwhnBYKiZ5Ube07rPIB2wF1QCLcBGAs/s1600/05%2BIllustasi%2B-%2BDU%2BRecorder.png"},
            {"Share Konten", "Youtube Lihat apa yang ditonton orang-orang di seluruh dunia dari video musik terpopuler hingga game, hiburan, berita, dan hal lainnya yang sedang tren. Berlanggananlah ke saluran yang Anda sukai, bagikan dengan teman, dan tonton di perangkat mana saja.", "https://1.bp.blogspot.com/-vCck-12llTk/XVLbED0S3PI/AAAAAAAABB4/UaPn8v2AOnAWEXipe4Q-Iafgwt5HNrO6ACLcBGAs/s1600/06%2BShare%2BKonten%2B-%2BYoutube.png"},
            {"Info Kelas", "Blogger Tulisan, artikel atau informasi bermanfaat yang diupdate (diperbaharui) secara teratur dan dapat diakses secara online baik untuk umum maupun pribadi", "https://1.bp.blogspot.com/-M9jyWYT9DMI/XVLmLp2rszI/AAAAAAAABCQ/QabHNJhruswt8Gt-GUkKWTodZUXfXZc-wCLcBGAs/s1600/07%2BInfo%2BKelas%2B-%2BBlogger.png"},
            {"Evaluasi", "Google Spreadsheet dapat digunakan untuk mempercantik data Anda dengan bagan dan grafik berwarna-warni. Formula terpadu, tabel pivot, dan opsi pemformatan bersyarat menghemat waktu dan menyederhanakan tugas umum spreadsheet. Semuanya gratis. ", "https://1.bp.blogspot.com/-q4xL5xk0Uuw/XVLmS_kyj8I/AAAAAAAABCU/CrKgLCuIZOwp44iWqQ3GcvexUq-3wVBLQCLcBGAs/s1600/08%2BEvaluasi%2B-%2BGoogle%2BSheet.png"},
            {"Media Diskusi", "WhatsApp Messenger merupakan aplikasi pesan lintas platform yang memungkinkan kita bertukar pesan tanpa biaya SMS , karena WhatsApp Messenger menggunakan paket data internet yang sama untuk email , browsing web, dan lain-lain", "https://1.bp.blogspot.com/-0JveO_MoxvM/XVLuaFJvxjI/AAAAAAAABCw/uAz6PwGniFAGFbMqfNtIE8CB_1lMI3vegCLcBGAs/s1600/09%2BMedia%2BDiskusi%2B-%2BWhatsapp.png"},
            {"Manajemen Waktu", "Jorte adalah aplikasi kalender yang paling eye-catching yang ada di dalam daftar ini. Bagaimana tidak, sentuhan warna-warna dan emoticon yang ada di dalam kalender ini membuat kamu lebih mudah untuk melihat dan mengatur jadwal.", "https://1.bp.blogspot.com/-ml8oaz-jrYc/XVLxC1flOuI/AAAAAAAABDI/8wfOdmmyBI0b9mG_vihQ3KBSaq784wrHgCLcBGAs/s1600/10%2BManajemen%2BWaktu%2B-%2BWhatsapp.png"},
    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }

        return list;
    }
}
