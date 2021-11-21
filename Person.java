package com.smkalihsan.javaproject.atm;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Person {
    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        Person tgl = new Person();
        Scanner scanner = new Scanner(System.in);

        Card jenisKartu = new Card("Debit Card Bank BCA", "Debit Card Bank Mega", "Debit Card Bank Mandiri", "Debit Card Bank BRI", "Debit Card Bank BTN", 223451, 112331, 332123, 113344, 332909, 1_000_000, 1_000_000, 1_000_000, 1_000_000, 1_000_000);
        System.out.println("Selamat datang di mesin ATM.");
        System.out.println("Jenis kartu yang dapat digunakan dalam mesin ATM.");
        System.out.println("BANK BCA| BANK MEGA| BANK MANDIRI| BANK BRI| BANK BTN.");
        System.out.println("=======================================================");
        System.out.println("Gunakan nama Bank untuk memasukan kartu.");
        System.out.print("Masukan Kartu: ");
        String card = scanner.next();
        if (Objects.equals(card, "BCA")) {
            jenisKartu.BCA();
        } else if (Objects.equals(card, "Mega")) {
            jenisKartu.BMega();
        } else if (Objects.equals(card, "Mandiri")) {
            jenisKartu.BMandiri();
        } else if (Objects.equals(card, "BRI")) {
            jenisKartu.BRI();
        } else if (Objects.equals(card, "BTN")) {
            jenisKartu.BTN();
        } else {
            System.out.println("Maaf jenis kartu yang Anda masukkan tidak tersedia");
            System.exit(0);
        }

        System.out.print("Masukan Nomor Pin Anda: ");
        int nomor = scanner.nextInt();
        System.out.println("Apakah Nomor Pin Anda sudah sesuai dengan Kartu " + card + " Anda.");
        System.out.print(" ");
        String jawaban = scanner.next();
        if (Objects.equals(jawaban, "ya") || Objects.equals(jawaban, "iya") || Objects.equals(jawaban, "muhun") || Objects.equals(jawaban, "Ya") || Objects.equals(jawaban, "YA") || Objects.equals(jawaban, "Iya") || Objects.equals(jawaban, "IYA")) {
            if (nomor == jenisKartu.getNoPinBCA()) {
                System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                double nominalBCA = scanner.nextDouble();
                double jumlahBCA;
                if (nominalBCA <= jenisKartu.getSaldoBCA()) {
                    jumlahBCA = jenisKartu.getSaldoBCA() - nominalBCA;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah saldo Anda sekarang " + jumlahBCA);
                    System.out.println("========================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBCA());
                    System.out.println("Sesudah penarikan " + jumlahBCA);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("Waktu: " + tgl.getWaktu());
                    System.out.println("Melayani Dengan Setulus Hati");
                } else if (jenisKartu.getSaldoBCA() <= nominalBCA) {
                    System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBCA1 = scanner.nextDouble();
                    double jumlahBCA1;
                    if (nominalBCA1 <= jenisKartu.getSaldoBCA()) {
                        jumlahBCA1 = jenisKartu.getSaldoBCA() - nominalBCA1;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBCA1);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBCA());
                        System.out.println("Sesudah penarikan " + jumlahBCA1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else {
                        System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKartu.getNoPinBMega()) {
                System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                double nominalMEGA = scanner.nextDouble();
                double jumlahMEGA;
                if (nominalMEGA <= jenisKartu.getSaldoBMega()) {
                    jumlahMEGA = jenisKartu.getSaldoBMega() - nominalMEGA;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah saldo Anda sekarang " + jumlahMEGA);
                    System.out.println("========================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMega());
                    System.out.println("Sesudah penarikan " + jumlahMEGA);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("Waktu: " + tgl.getWaktu());
                    System.out.println("Melayani Dengan Setulus Hati");
                } else if (jenisKartu.getSaldoBMega() <= nominalMEGA) {
                    System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalMEGA1 = scanner.nextDouble();
                    double jumlahMEGA1;
                    if (nominalMEGA1 <= jenisKartu.getSaldoBMega()) {
                        jumlahMEGA1 = jenisKartu.getSaldoBMega() - nominalMEGA1;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahMEGA1);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMega());
                        System.out.println("Sesudah penarikan " + jumlahMEGA1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else {
                        System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKartu.getNoPinBMandiri()) {
                System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                double nominalMANDIRI = scanner.nextDouble();
                double jumlahMANDIRI;
                if (nominalMANDIRI <= jenisKartu.getSaldoBMandiri()) {
                    jumlahMANDIRI = jenisKartu.getSaldoBMandiri() - nominalMANDIRI;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah saldo Anda sekarang " + jumlahMANDIRI);
                    System.out.println("========================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMandiri());
                    System.out.println("Sesudah penarikan " + jumlahMANDIRI);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("Waktu: " + tgl.getWaktu());
                    System.out.println("Melayani Dengan Setulus Hati");
                } else if (jenisKartu.getSaldoBMandiri() <= nominalMANDIRI) {
                    System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalMANDIRI1 = scanner.nextDouble();
                    double jumlahMANDIRI1;
                    if (nominalMANDIRI1 <= jenisKartu.getSaldoBMandiri()) {
                        jumlahMANDIRI1 = jenisKartu.getSaldoBMandiri() - nominalMANDIRI1;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahMANDIRI1);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMandiri());
                        System.out.println("Sesudah penarikan " + jumlahMANDIRI1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else {
                        System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKartu.getNoPinBRI()) {
                System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                double nominalBRI = scanner.nextDouble();
                double jumlahBRI;
                if (nominalBRI <= jenisKartu.getSaldoBRI()) {
                    jumlahBRI = jenisKartu.getSaldoBRI() - nominalBRI;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah saldo Anda sekarang " + jumlahBRI);
                    System.out.println("========================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBRI());
                    System.out.println("Sesudah penarikan " + jumlahBRI);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("Waktu: " + tgl.getWaktu());
                    System.out.println("Melayani Dengan Setulus Hati");
                } else if (jenisKartu.getSaldoBRI() <= nominalBRI) {
                    System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBRI1 = scanner.nextDouble();
                    double jumlahBRI1;
                    if (nominalBRI1 <= jenisKartu.getSaldoBRI()) {
                        jumlahBRI1 = jenisKartu.getSaldoBRI() - nominalBRI1;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBRI1);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBRI());
                        System.out.println("Sesudah penarikan " + jumlahBRI1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else {
                        System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKartu.getNoPinBTN()) {
                System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                double nominalBTN = scanner.nextDouble();
                double jumlahBTN;
                if (nominalBTN <= jenisKartu.getSaldoBTN()) {
                    jumlahBTN = jenisKartu.getSaldoBTN() - nominalBTN;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah saldo Anda sekarang " + jumlahBTN);
                    System.out.println("========================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBTN());
                    System.out.println("Sesudah penarikan " + jumlahBTN);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("Waktu: " + tgl.getWaktu());
                    System.out.println("Melayani Dengan Setulus Hati");
                } else if (jenisKartu.getSaldoBTN() <= nominalBTN) {
                    System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBTN1 = scanner.nextDouble();
                    double jumlahBTN1;
                    if (nominalBTN1 <= jenisKartu.getSaldoBTN()) {
                        jumlahBTN1 = jenisKartu.getSaldoBTN() - nominalBTN1;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBTN1);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBTN());
                        System.out.println("Sesudah penarikan " + jumlahBTN1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else {
                        System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Maaf nomor pin yang Anda masukan salah silahkan ulangi lagi");
                    System.exit(0);
                }
            }
        } else if (Objects.equals(jawaban, "tidak") || Objects.equals(jawaban, "no")) {
            System.out.println("Silahkan pilih ulang Kartu dengan menggunakan nama bank untuk memasukan kartu");
            System.out.print("Masukan Kartu: ");
            String card2 = scanner.next();
            if (Objects.equals(card2, "BCA")) {
                jenisKartu.BCA();
            } else if (Objects.equals(card2, "Mega")) {
                jenisKartu.BMega();
            } else if (Objects.equals(card2, "Mandiri")) {
                jenisKartu.BMandiri();
            } else if (Objects.equals(card2, "BRI")) {
                jenisKartu.BRI();
            } else if (Objects.equals(card2, "BTN")) {
                jenisKartu.BTN();
            } else {
                System.out.println("Maaf jenis kartu yang Anda masukkan tidak tersedia");
                System.exit(0);
            }
            System.out.print("Masukan Nomor Pin Anda: ");
            int nomor2 = scanner.nextInt();
            System.out.println("Apakah Nomor Pin Anda sudah sesuai dengan Kartu " + card2 + " Anda.");
            System.out.print(" ");
            String jawaban2 = scanner.next();
            if (Objects.equals(jawaban2, "ya") || Objects.equals(jawaban2, "iya") || Objects.equals(jawaban2, "muhun") || Objects.equals(jawaban2, "Ya") || Objects.equals(jawaban2, "YA") || Objects.equals(jawaban2, "Iya") || Objects.equals(jawaban2, "IYA")) {
                if (nomor2 == jenisKartu.getNoPinBCA()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBCA2 = scanner.nextDouble();
                    double jumlahBCA2;
                    if (nominalBCA2 <= jenisKartu.getSaldoBCA()) {
                        jumlahBCA2 = jenisKartu.getSaldoBCA() - nominalBCA2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBCA2);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBCA());
                        System.out.println("Sesudah penarikan " + jumlahBCA2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else if (jenisKartu.getSaldoBCA() <= nominalBCA2) {
                        System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                        System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                        double nominalBCA3 = scanner.nextDouble();
                        double jumlahBCA3;
                        if (nominalBCA3 <= jenisKartu.getSaldoBCA()) {
                            jumlahBCA3 = jenisKartu.getSaldoBCA() - nominalBCA3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah saldo Anda sekarang " + jumlahBCA3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBCA());
                            System.out.println("Sesudah penarikan " + jumlahBCA3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Melayani Dengan Setulus Hati");
                        } else {
                            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKartu.getNoPinBMega()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalMEGA2 = scanner.nextDouble();
                    double jumlahMEGA2;
                    if (nominalMEGA2 <= jenisKartu.getSaldoBMega()) {
                        jumlahMEGA2 = jenisKartu.getSaldoBMega() - nominalMEGA2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahMEGA2);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMega());
                        System.out.println("Sesudah penarikan " + jumlahMEGA2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else if (jenisKartu.getSaldoBMega() <= nominalMEGA2) {
                        System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                        System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                        double nominalMEGA3 = scanner.nextDouble();
                        double jumlahMEGA3;
                        if (nominalMEGA3 <= jenisKartu.getSaldoBMega()) {
                            jumlahMEGA3 = jenisKartu.getSaldoBMega() - nominalMEGA3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah saldo Anda sekarang " + jumlahMEGA3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMega());
                            System.out.println("Sesudah penarikan " + jumlahMEGA3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Melayani Dengan Setulus Hati");
                        } else {
                            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKartu.getNoPinBMandiri()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalMANDIRI2 = scanner.nextDouble();
                    double jumlahMANDIRI2;
                    if (nominalMANDIRI2 <= jenisKartu.getSaldoBMandiri()) {
                        jumlahMANDIRI2 = jenisKartu.getSaldoBMandiri() - nominalMANDIRI2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahMANDIRI2);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMandiri());
                        System.out.println("Sesudah penarikan " + jumlahMANDIRI2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else if (jenisKartu.getSaldoBMandiri() <= nominalMANDIRI2) {
                        System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                        System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                        double nominalMANDIRI3 = scanner.nextDouble();
                        double jumlahMANDIRI3;
                        if (nominalMANDIRI3 <= jenisKartu.getSaldoBMandiri()) {
                            jumlahMANDIRI3 = jenisKartu.getSaldoBMandiri() - nominalMANDIRI3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah saldo Anda sekarang " + jumlahMANDIRI3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBMandiri());
                            System.out.println("Sesudah penarikan " + jumlahMANDIRI3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Melayani Dengan Setulus Hati");
                        } else {
                            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKartu.getNoPinBRI()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBRI2 = scanner.nextDouble();
                    double jumlahBRI2;
                    if (nominalBRI2 <= jenisKartu.getSaldoBRI()) {
                        jumlahBRI2 = jenisKartu.getSaldoBRI() - nominalBRI2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBRI2);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBRI());
                        System.out.println("Sesudah penarikan " + jumlahBRI2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else if (jenisKartu.getSaldoBRI() <= nominalBRI2) {
                        System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                        System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                        double nominalBRI3 = scanner.nextDouble();
                        double jumlahBRI3;
                        if (nominalBRI3 <= jenisKartu.getSaldoBRI()) {
                            jumlahBRI3 = jenisKartu.getSaldoBRI() - nominalBRI3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah saldo Anda sekarang " + jumlahBRI3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBRI());
                            System.out.println("Sesudah penarikan " + jumlahBRI3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Melayani Dengan Setulus Hati");
                        } else {
                            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKartu.getNoPinBTN()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBTN2 = scanner.nextDouble();
                    double jumlahBTN2;
                    if (nominalBTN2 <= jenisKartu.getSaldoBTN()) {
                        jumlahBTN2 = jenisKartu.getSaldoBTN() - nominalBTN2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah saldo Anda sekarang " + jumlahBTN2);
                        System.out.println("========================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBTN());
                        System.out.println("Sesudah penarikan " + jumlahBTN2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Melayani Dengan Setulus Hati");
                    } else if (jenisKartu.getSaldoBTN() <= nominalBTN2) {
                        System.out.println("Maaf saldo Anda tidak mencukupi untuk penarikan dana");
                        System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                        double nominalBTN3 = scanner.nextDouble();
                        double jumlahBTN3;
                        if (nominalBTN3 <= jenisKartu.getSaldoBTN()) {
                            jumlahBTN3 = jenisKartu.getSaldoBTN() - nominalBTN3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah saldo Anda sekarang " + jumlahBTN3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Sebelum penarikan " + jenisKartu.getSaldoBTN());
                            System.out.println("Sesudah penarikan " + jumlahBTN3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Melayani Dengan Setulus Hati");
                        } else {
                            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Maaf nomor pin yang Anda masukan salah silahkan ulangi lagi");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                    System.exit(0);
                }
            } else {
                    System.out.println("Transaksi Anda gagal silahkan ulangi lagi");
                    System.exit(0);
            }
        } else {
            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
            System.exit(0);
        }
    }
}
