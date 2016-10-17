-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2015 pada 03.03
-- Versi Server: 5.6.11
-- Versi PHP: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `manajemen_asset`
--
CREATE DATABASE IF NOT EXISTS `manajemen_asset` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `manajemen_asset`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `asset`
--

CREATE TABLE IF NOT EXISTS `asset` (
  `idAsset` int(11) NOT NULL,
  `jenisAsset` varchar(20) NOT NULL,
  `namaAsset` varchar(32) NOT NULL,
  `merk` varchar(15) NOT NULL,
  `warna` varchar(10) NOT NULL,
  `tanggalPembelian` date NOT NULL,
  `harga` double NOT NULL,
  `lokasi` varchar(32) NOT NULL,
  `namaPetugas` varchar(32) NOT NULL,
  PRIMARY KEY (`idAsset`),
  KEY `idPetugas` (`namaPetugas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `asset`
--

INSERT INTO `asset` (`idAsset`, `jenisAsset`, `namaAsset`, `merk`, `warna`, `tanggalPembelian`, `harga`, `lokasi`, `namaPetugas`) VALUES
(1, 'Perlengkapan', 'Bangku', 'Olimpic', 'Coklat', '2014-12-05', 220000, 'Ruangan Kelas', 'Petugas Logistik'),
(2, 'Perlengkapan', 'Kursi', 'Olimpic', 'Coklat', '2014-12-04', 220000, 'Ruangan Kelas', 'Petugas Logistik'),
(3, 'Elektronik', 'Ac', 'LG', 'Putih', '2014-12-19', 1200000, 'Ruang Guru', 'Petugas Logistik'),
(4, 'Elektronik', 'Speaker', 'Simbada', 'Putih', '2014-12-24', 500000, 'Ruang Tata Usaha', 'Petugas Logistik'),
(5, 'Elektronik', 'Proyektor', 'Infokus', 'Putih', '2014-11-03', 2500000, 'Ruangan Kelas', 'Petugas Logistik'),
(6, 'Elektronik', 'Kipas Angin', 'Lg', 'Putih', '2014-11-04', 1900000, 'Ruang Guru', 'Petugas Logistik'),
(7, 'Mebeul', 'Kursi', 'Olimpic', 'Coklat', '2014-12-03', 1700000, 'Ruang Kelas', 'Petugas Logistik'),
(8, 'Mebeul', 'Meja', 'Olimpic', 'Coklat', '2014-11-05', 1900000, 'Ruangan Kelas', 'Petugas Logistik'),
(9, 'Mebeul', 'Lemari', 'Olimpic', 'Coklat', '2014-11-05', 2000000, 'Ruang Guru', 'Petugas Logistik'),
(10, 'Perlengkapan', 'Bola Basket', 'Molten', 'Orange', '2014-12-01', 200000, 'Ruang Olahraga', 'Petugas Logistik'),
(11, 'Perlengkapan', 'Bola Futsal', 'Addidas', 'Hijau', '2014-12-01', 300000, 'Ruang Olahraga', 'Petugas Logistik'),
(12, 'Elektronik', 'Televisi', 'Toshiba', 'Hitam', '2014-11-20', 2500000, 'Ruangan Tata Usaha', 'Petugas Logistik'),
(13, 'Elektronik', 'Keyboard', 'Yamaha', 'Silver', '2014-01-29', 12000, 'Ruang Kesenian', 'Petugas Logistik'),
(14, 'Perlengkapan', 'Bola Volly', 'Mikasa', 'Putih', '2014-11-18', 200000, 'Ruang Olahraga', 'Petugas Logistik'),
(15, 'Elektronik', 'Speaker', 'Simbada', 'Hitam', '2014-12-03', 400000, 'Ruangan Kelas', 'Petugas Logistik'),
(16, 'perlengkapan', 'Kasur Matras', 'Swallow', 'Hitam', '2014-12-19', 175000, 'Ruang Olahraga', 'Petugas Logistik'),
(17, 'perlengkapan', 'Sarung', 'Gajah Duduk', 'Coklat', '2014-12-12', 1500000, 'Mesjid', 'Petugas Logistik'),
(18, 'Zat Kimia', 'Metanol', 'Metana', 'Bening', '2014-11-30', 200000, 'Laoratorium Kimia', 'Petugas Logistik'),
(19, 'Elektronik', 'Modem', 'Huawai', 'Hitam', '2014-12-05', 200000, 'Ruang Guru', 'Petugas Logistik'),
(20, 'Elektronik', 'Handphone', 'Toshiba', 'Hitam', '2014-12-03', 1200000, 'Ruang Guru', 'Petugas Logistik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawatan`
--

CREATE TABLE IF NOT EXISTS `perawatan` (
  `idPerawatan` int(11) NOT NULL,
  `namaAsset` varchar(32) NOT NULL,
  `namaPetugas` varchar(32) NOT NULL,
  `tanggalPerawatan` date NOT NULL,
  `kondisi` varchar(15) NOT NULL,
  `keterangan` text NOT NULL,
  PRIMARY KEY (`idPerawatan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `perawatan`
--

INSERT INTO `perawatan` (`idPerawatan`, `namaAsset`, `namaPetugas`, `tanggalPerawatan`, `kondisi`, `keterangan`) VALUES
(1, 'Bangku', 'Petugas Logistik', '2014-12-06', 'Rusak', 'Kondisi Barang dalam keadaan Perbaikan'),
(10, 'Kursi', 'Petugas Logistik', '2014-12-05', 'Perawatan', 'Kondisi Barang dalam Tahap Pengerjaan'),
(101, 'Bola Basket', 'Petugas Logistik', '2014-12-13', 'kjlkjkl', 'Kondisi Barang dalam keadaan rusak'),
(1010, 'Speaker', 'Petugas Logistik', '2014-12-06', 'Rusak', 'Kondisi Barang dalam keadaan rusak'),
(10100, 'Televisi', 'Petugas Logistik', '2014-12-12', 'Peraatan', 'Kondisi Barang dalam keadaan perbaikan'),
(10101, 'Metanol', 'Petugas Logistik', '2014-12-12', 'Habis', 'Kondisi barang dalam keadaan tidak tersedia'),
(10102, 'Ac', 'Dede Saepul Rahman', '2014-12-11', 'Maintenanc', 'Kondisi Barang dalam keadaan isi ulang freon'),
(10103, 'Keyboard', 'Fanny Widia Asri', '2014-11-25', 'Upgrade', 'Kondisi barang dalam tahap pengisian lagu untuk di keyboard'),
(10104, 'Bola Volly', 'Dede Saepul Rahman', '2014-12-01', 'Rusak', 'Kondisi barang dalam keadaan rusak'),
(10105, 'Sarung', 'Dede Saepul Rahman', '2014-12-03', 'Rusak', 'Kondisi barang dalam keadaan rusak.'),
(10107, 'Kipas Angin', 'Petugas Lapangan', '2014-12-19', 'Rusak', 'Kondisi barang Tidak bisa nyala'),
(12121, 'Proyektor', 'Petugas Lapangan', '2014-12-18', 'Maintance', 'Karena Pencahayaan kurang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `idPetugas` int(11) NOT NULL,
  `namaPetugas` varchar(32) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `akses` varchar(32) NOT NULL,
  PRIMARY KEY (`idPetugas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`idPetugas`, `namaPetugas`, `jabatan`, `password`, `akses`) VALUES
(1, 'Ahmad Insan Nawawi', 'Tata Usaha', 'asdfasdf', 'View'),
(2, 'Dede Saepul Rahman', 'Petugas Logistik', 'asdfasdf', 'CRUD(a,p,r)_noDel'),
(3, 'Dana Sukandar', 'Petugas Sarana', 'asdfasdf', 'CRUD'),
(4, 'Hilman Hilmawan', 'Petugas Lapangan', 'asdfasdf', 'CRUD(a,p,r)_noDel');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE IF NOT EXISTS `ruangan` (
  `idRuangan` int(11) NOT NULL,
  `namaRuangan` varchar(32) NOT NULL,
  `jenisRuangan` varchar(15) NOT NULL,
  `lokasi` varchar(32) NOT NULL,
  `namaPetugas` varchar(32) NOT NULL,
  PRIMARY KEY (`idRuangan`),
  KEY `idPetugas` (`namaPetugas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`idRuangan`, `namaRuangan`, `jenisRuangan`, `lokasi`, `namaPetugas`) VALUES
(1010, 'Kelas 10', 'Kelas', 'Samping WC Guru', 'Petugas Lapangan'),
(1020, 'Ruang Guru', 'Kelas', 'Samping Ruang Komputer', 'Petugas Lapangan'),
(1030, 'Ruang Olahraga', 'Aula', 'Samping Kiri Ruang Komputer', 'Petugas Lapangan'),
(1040, 'Mushola', 'Aula', 'Samping Kantin Sekolah', 'Petugas Lapangan'),
(1050, 'Tata Usaha', 'Aula', 'Depan Gerbang Masuk', 'Petugas Lapangan'),
(1060, 'Ruang Seni', 'Aula', 'Samping Ruang Tata Usaha', 'Petugas Lapangan'),
(1070, 'Ruang Komputer', 'Kelas', 'Samping Ruang guru', 'Petugas Lapangan'),
(1080, 'Laboratorium Kimia', 'Laboratorium', 'Samping Ruang Olahraga', 'Petugas Lapangan'),
(1090, 'Laboratorium Fisika', 'Laboratorium', 'Samping Laboratorum Kimia', 'Petugas Lapangan'),
(1100, 'Laboratorium Biologi', 'Laboratorium', 'Samping Laboratorium Fisika', 'Petugas Lapangan'),
(1110, 'Laboratorium Bahasa', 'Laboratorium', 'Samping Laboratorum Biologi', 'Petugas Lapangan'),
(1120, 'Perpustakaan', 'Ruangan', 'Samping Ruang BK', 'Petugas Lapangan'),
(1130, 'Ruang BK', 'Ruangan', 'Samping Perpustakaan', 'Petugas Lapangan'),
(1140, 'UKS', 'Ruangan', 'Samping Ruang Osis', 'Petugas Lapangan'),
(1150, 'Ruang OSIS', 'Ruangan', 'Samping Ruang UKS', 'Petugas Lapangan'),
(1160, 'Ruang Ekstrakulikuler', 'Ruangan', 'Samping Ruang Osis', 'Petugas Lapangan'),
(1170, 'Ruang Security', 'Ruangan', 'Samping Gerbang Masuk', 'Petugas Lapangan'),
(1180, 'Gudang', 'Gudang', 'Samping Lapang Futsal', 'Petugas Lapangan'),
(1190, 'Kelas 12A', 'Kelas', 'Dekat Mushola', 'Petugas Lapangan');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
