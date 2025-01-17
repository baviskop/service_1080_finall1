-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2025 at 08:13 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `service_1080_finall`
--

-- --------------------------------------------------------

--
-- Table structure for table `dichvu`
--

CREATE TABLE `dichvu` (
  `ID` int(11) NOT NULL,
  `TenDichVu` varchar(100) NOT NULL,
  `Mota` text DEFAULT NULL,
  `Gia` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `dichvu`
--

INSERT INTO `dichvu` (`ID`, `TenDichVu`, `Mota`, `Gia`) VALUES
(1, 'Internet Cap Quang', 'Cung Cap dich vu internet toc do cao', 500000.00),
(2, 'Hosting Web', 'Luu tru web tren server', 300000.00),
(3, 'Lap dat Camera', 'Lap dat he thong camera an ninh', 2000000.00),
(8, 'Internet', 'Dịch vụ truy cập internet tốc độ cao', 200000.00),
(9, 'Điện thoại', 'Gọi nội địa và quốc tế', 150000.00),
(10, 'Truyền hình', 'Các kênh giải trí và thể thao', 180000.00),
(11, 'Email', 'Hộp thư điện tử', 50000.00),
(12, 'Bảo trì', 'Bảo trì hệ thống máy tính', 100000.00),
(13, 'Lưu trữ đám mây', 'Dung lượng lưu trữ trực tuyến', 250000.00),
(14, 'Chống virus', 'Phần mềm bảo mật máy tính', 80000.00),
(15, 'Tư vấn IT', 'Hỗ trợ kỹ thuật công nghệ', 120000.00),
(16, 'Hội nghị trực tuyến', 'Kết nối video mọi nơi', 300000.00),
(17, 'Đào tạo online', 'Học tập từ xa trực tuyến', 150000.00),
(18, 'Thương mại điện tử', 'Hỗ trợ bán hàng trực tuyến', 200000.00),
(19, 'SEO', 'Tối ưu hóa công cụ tìm kiếm', 180000.00),
(20, 'Thiết kế web', 'Tạo trang web chuyên nghiệp', 250000.00),
(21, 'Dịch thuật', 'Chuyển đổi ngôn ngữ chính xác', 100000.00),
(23, 'Lập trình', 'Phát triển phần mềm tùy chỉnh', 400000.00),
(24, 'Marketing online', 'Quảng cáo trên mạng xã hội', 200000.00),
(25, 'Chụp ảnh sản phẩm', 'Ảnh đẹp cho sản phẩm', 100000.00),
(26, 'Quản lý dự án', 'Công cụ theo dõi dự án', 300000.00),
(27, 'Quản lý tài liệu', 'Hệ thống lưu trữ thông tin', 150000.00),
(28, 'Hỗ trợ khách hàng', 'Dịch vụ hỗ trợ 24/7', 120000.00),
(29, 'Kiểm thử phần mềm', 'Đảm bảo chất lượng phần mềm', 180000.00),
(30, 'Hệ thống email', 'Cài đặt hệ thống email', 80000.00),
(31, 'Chạy quảng cáo', 'Quảng cáo trực tuyến hiệu quả', 250000.00),
(32, 'Phân tích dữ liệu', 'Xử lý và phân tích số liệu', 300000.00),
(33, 'Phần mềm kế toán', 'Quản lý tài chính doanh nghiệp', 350000.00),
(34, 'Thiết kế đồ họa', 'Thiết kế hình ảnh sáng tạo', 200000.00),
(35, 'Hosting', 'Lưu trữ website', 120000.00),
(36, 'Domain', 'Đăng ký tên miền', 100000.00),
(37, 'Lập kế hoạch kinh doanh', 'Xây dựng kế hoạch hiệu quả', 400000.00),
(38, 'Ứng dụng di động', 'Phát triển app cho doanh nghiệp', 500000.00),
(39, 'Dịch vụ backup', 'Sao lưu dữ liệu an toàn', 250000.00),
(40, 'Phần mềm quản lý', 'Giải pháp quản lý công việc', 300000.00),
(41, 'Cài đặt mạng', 'Cấu hình mạng doanh nghiệp', 200000.00),
(42, 'Khảo sát thị trường', 'Nghiên cứu thị trường chuyên sâu', 180000.00),
(43, 'Tư vấn pháp lý', 'Hỗ trợ pháp lý chuyên nghiệp', 350000.00),
(44, 'Giám sát an ninh', 'Lắp đặt camera và giám sát', 450000.00),
(45, 'Quản trị nhân sự', 'Giải pháp quản lý nhân viên', 300000.00),
(46, 'Tổ chức sự kiện', 'Dịch vụ tổ chức hội nghị', 400000.00),
(47, 'Sửa chữa phần cứng', 'Khắc phục lỗi máy tính', 150000.00),
(48, 'Đồng bộ dữ liệu', 'Đồng bộ hóa nhiều thiết bị', 200000.00),
(49, 'Tư vấn tài chính', 'Lập kế hoạch tài chính cá nhân', 350000.00),
(50, 'Phát triển AI', 'Ứng dụng trí tuệ nhân tạo', 600000.00),
(51, 'Quản lý kho', 'Phần mềm quản lý hàng hóa', 300000.00),
(52, 'Lập trình nhúng', 'Phát triển hệ thống nhúng', 500000.00),
(53, 'Trung tâm dữ liệu', 'Quản lý và lưu trữ dữ liệu', 600000.00),
(54, 'An ninh mạng', 'Giải pháp bảo vệ thông tin', 450000.00),
(55, 'Thiết kế UI/UX', 'Tối ưu giao diện người dùng', 300000.00),
(56, 'Dịch vụ game', 'Cung cấp nền tảng game', 250000.00),
(57, 'Chùi nhà vệ sinh', 'Nhanh sạch', 20000.00);

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `ID` int(11) NOT NULL,
  `ten` varchar(100) NOT NULL,
  `tuoi` int(11) NOT NULL,
  `diaChi` varchar(200) NOT NULL,
  `soDienThoai` varchar(15) NOT NULL,
  `khuVuc` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`ID`, `ten`, `tuoi`, `diaChi`, `soDienThoai`, `khuVuc`) VALUES
(1, 'Hầu Thanh Long', 18, 'Xuân LỘc', '0373002290', 'Bắc'),
(2, 'Bành Thị Tu', 20, '158 Huyen Tran', '0127849322', 'Bắc'),
(3, 'To Thi Ngoc Thao', 20, 'Ben Nghe', '0905426399', 'Bắc'),
(10, 'Nguyễn Văn An', 25, 'Hà Nội', '0912345678', 'Bắc'),
(11, 'Trần Thị Bình', 30, 'Hải Phòng', '0923456789', 'Bắc'),
(12, 'Lê Văn Cường', 35, 'Đà Nẵng', '0934567890', 'Trung'),
(13, 'Phạm Thị Dung', 28, 'Huế', '0945678901', 'Trung'),
(14, 'Hoàng Văn Nghĩa', 100, 'Huế 2', '0123456789', 'Trung'),
(15, 'Ngô Thị Phương', 22, 'Cần Thơ', '0967890123', 'Nam'),
(16, 'Đỗ Văn Giang', 45, 'Bắc Ninh', '0978901234', 'Bắc'),
(17, 'Mai Thị Hương', 33, 'Quảng Nam', '0989012345', 'Trung'),
(18, 'Vũ Văn Inh', 29, 'Bình Dương', '0990123456', 'Nam'),
(19, 'Lý Thị Kim', 38, 'Hà Nội', '0901234567', 'Bắc'),
(20, 'Trần Văn Long', 27, 'Thái Bình', '0912345679', 'Bắc'),
(21, 'Nguyễn Thị Mai', 31, 'Nam Định', '0923456788', 'Bắc'),
(22, 'Phạm Văn Nam', 36, 'Quảng Ngãi', '0934567891', 'Trung'),
(23, 'Lê Thị Oanh', 29, 'Nha Trang', '0945678902', 'Trung'),
(24, 'Hoàng Văn Phúc', 41, 'Vũng Tàu', '0956789013', 'Bắc'),
(25, 'Vũ Thị Quỳnh', 23, 'Cà Mau', '0967890124', 'Nam'),
(26, 'Đặng Văn Rồng', 46, 'Bắc Giang', '0978901235', 'Bắc'),
(27, 'Nguyễn Thị Sen', 34, 'Quảng Trị', '0989012346', 'Trung'),
(28, 'Trần Văn Tùng', 30, 'Đồng Nai', '0990123457', 'Nam'),
(29, 'Phạm Thị Uyên', 39, 'Hải Dương', '0901234568', 'Bắc'),
(30, 'Lê Văn Việt', 26, 'Vĩnh Phúc', '0912345680', 'Bắc'),
(31, 'Nguyễn Thị Xuân', 32, 'Thanh Hóa', '0923456790', 'Bắc'),
(32, 'Trần Văn Yến', 37, 'Quảng Bình', '0934567892', 'Trung'),
(33, 'Phạm Thị Zara', 28, 'Quảng Nam', '0945678903', 'Trung'),
(34, 'Hoàng Văn Anh', 42, 'Tiền Giang', '0956789014', 'Nam'),
(35, 'Lê Thị Bảo', 24, 'Sóc Trăng', '0967890125', 'Nam'),
(36, 'Nguyễn Văn Công', 47, 'Lào Cai', '0978901236', 'Nam'),
(37, 'Trần Thị Diệp', 35, 'Bình Định', '0989012347', 'Trung'),
(38, 'Phạm Văn Đức', 31, 'Tây Ninh', '0990123458', 'Nam'),
(39, 'Hoàng Thị Em', 40, 'Phú Thọ', '0901234569', 'Nam'),
(42, 'Long Đú Đởn', 19, 'Xuân Bắc Mỹ', '0373002298', 'Trung'),
(43, 'Long Đú Đởn', 19, 'Xuân Bắc Mỹ', '0373002298', 'Trung');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Pass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `Pass`) VALUES
(1, 'admin', 'admin123'),
(2, 'user1', 'password1');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `ID` int(11) NOT NULL,
  `Ten` varchar(100) NOT NULL,
  `Tuoi` int(11) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `SoDienThoai` varchar(15) DEFAULT NULL,
  `KhuVuc` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`ID`, `Ten`, `Tuoi`, `DiaChi`, `SoDienThoai`, `KhuVuc`) VALUES
(1, 'Nguyen Huu Dung', 18, 'Huế', '0909123457', 'Nam'),
(2, 'Pham Thi Hoa', 19, 'Hai Thị Sen', '0909090912', 'Bắc'),
(3, 'Tran Van Hoang', 18, '158 La Thành', '0373003398', 'Bắc'),
(6, 'Nguyen Thi Lan', 25, 'Hà Nội', '0987654321', 'Bắc'),
(7, 'Tran Minh Tu', 28, 'Hồ Chí Minh', '0912345678', 'Nam'),
(8, 'Pham Minh Hoang', 30, 'Đà Nẵng', '0922334455', 'Trung'),
(9, 'Le Thi Bich', 22, 'Hải Phòng', '0933445566', 'Bắc'),
(10, 'Hoang Minh Tam', 26, 'Cần Thơ', '0944556677', 'Nam'),
(11, 'Nguyen Thuy Duong', 35, 'Vĩnh Long', '0966778899', 'Nam'),
(12, 'Pham Thi Mai', 40, 'Quảng Ninh', '0977889900', 'Bắc'),
(13, 'Vu Minh Quang', 32, 'Bình Dương', '0988776655', 'Nam'),
(14, 'Nguyen Thu Lan', 27, 'Bắc Ninh', '0955223344', 'Bắc'),
(15, 'Nguyen Thanh Son', 23, 'Lào Cai', '0933446655', 'Bắc'),
(16, 'Mai Hoang Minh', 31, 'Thanh Hóa', '0945332211', 'Bắc'),
(17, 'Truong Thi Hong', 25, 'Vũng Tàu', '0977445566', 'Nam'),
(18, 'Le Thanh Hoa', 33, 'Bà Rịa - Vũng Tàu', '0911234567', 'Nam'),
(19, 'Hoang Thi Dung', 24, 'Hà Giang', '0922334455', 'Bắc'),
(20, 'Pham Thanh Mai', 29, 'Nghệ An', '0933445567', 'Bắc'),
(21, 'Le Thi Lan', 34, 'Hà Nội', '0966778899', 'Bắc'),
(22, 'Nguyen Hoang Mai', 27, 'Thái Nguyên', '0977889900', 'Bắc'),
(23, 'Tran Thanh Hoai', 26, 'Hưng Yên', '0912345678', 'Bắc'),
(24, 'Nguyen Thi Mai', 30, 'Quảng Bình', '0922334455', 'Bắc'),
(25, 'Bui Minh Tu', 35, 'Hà Nam', '0944556677', 'Bắc'),
(26, 'Le Hoang Nam', 32, 'Bắc Giang', '0977889900', 'Bắc'),
(27, 'Nguyen Thi Lan', 29, 'Đắk Lắk', '0966778899', 'Nam'),
(28, 'Mai Minh Lan', 24, 'Quảng Trị', '0988776655', 'Trung'),
(29, 'Hoang Thi Mai', 31, 'Ninh Bình', '0912233445', 'Bắc'),
(30, 'Truong Thi Thanh', 22, 'Kon Tum', '0933445566', 'Trung'),
(31, 'Bui Thi Hoa', 28, 'Vĩnh Phúc', '0944556677', 'Bắc'),
(32, 'Nguyen Thi Hoa', 36, 'Lâm Đồng', '0955223344', 'Nam'),
(33, 'Pham Thi Lan', 33, 'Thừa Thiên Huế', '0977889900', 'Trung'),
(34, 'Nguyen Thi Mai', 27, 'Cao Bằng', '0933445566', 'Bắc'),
(35, 'Hoang Minh Hoa', 28, 'Phú Thọ', '0922334455', 'Bắc'),
(36, 'Nguyen Thi Bich', 25, 'Kiên Giang', '0945332211', 'Nam'),
(37, 'Tran Thi Thanh', 31, 'Tây Ninh', '0912233445', 'Nam'),
(38, 'Le Minh Anh', 29, 'Hà Tĩnh', '0977889900', 'Bắc'),
(39, 'Pham Thanh Hương', 35, 'Quảng Nam', '0988776655', 'Trung'),
(40, 'Nguyen Hoang Anh', 32, 'Bình Phước', '0944556677', 'Nam'),
(41, 'Hoang Thi Thanh', 30, 'Vĩnh Long', '0955223344', 'Nam'),
(42, 'Nguyen Thi Lan', 26, 'Đắk Nông', '0966778899', 'Nam'),
(43, 'Mai Thi Thanh', 27, 'Lạng Sơn', '0933445566', 'Bắc'),
(44, 'Le Minh Quang', 30, 'Hòa Bình', '0944556677', 'Bắc'),
(45, 'Truong Thi Minh', 23, 'Phú Yên', '0922334455', 'Trung'),
(46, 'Bui Thi Mai', 34, 'An Giang', '0955223344', 'Nam'),
(47, 'Nguyen Thanh Tu', 33, 'Tiền Giang', '0912345678', 'Nam'),
(48, 'Hoang Thi Lan', 25, 'Bắc Ninh', '0945332211', 'Bắc'),
(49, 'Nguyen Minh Anh', 28, 'Bình Định', '0933445566', 'Trung'),
(50, 'Le Thanh Hoai', 27, 'Bắc Kạn', '0966778899', 'Bắc'),
(51, 'Pham Minh Hoai', 29, 'Hòa Bình', '0922334455', 'Bắc'),
(52, 'Nguyen Thi Bich', 28, 'Quảng Ninh', '0977889900', 'Bắc'),
(53, 'Truong Minh Thi', 32, 'Bà Rịa', '0933445566', 'Nam'),
(54, 'Hoang Minh Tu', 34, 'Tuyên Quang', '0912345678', 'Bắc');

-- --------------------------------------------------------

--
-- Table structure for table `yeucaudichvu`
--

CREATE TABLE `yeucaudichvu` (
  `MaYeuCau` int(11) NOT NULL,
  `NgayYeuCau` date NOT NULL,
  `TrangThai` varchar(50) DEFAULT NULL,
  `MaKhachHang` int(11) DEFAULT NULL,
  `MaDichVu` int(11) DEFAULT NULL,
  `MaNhanVien` int(11) DEFAULT NULL,
  `MucUuTien` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `yeucaudichvu`
--

INSERT INTO `yeucaudichvu` (`MaYeuCau`, `NgayYeuCau`, `TrangThai`, `MaKhachHang`, `MaDichVu`, `MaNhanVien`, `MucUuTien`) VALUES
(1, '2024-12-01', 'Đang xử lý', NULL, NULL, NULL, NULL),
(2, '2024-12-05', 'Dang xu ly', NULL, NULL, NULL, NULL),
(3, '2024-12-10', 'Cho xac nhan', NULL, NULL, NULL, NULL),
(51, '2023-11-23', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(52, '2023-11-24', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(53, '2023-11-25', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(54, '2023-11-26', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(55, '2023-11-27', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(56, '2023-11-28', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(57, '2023-11-29', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(58, '2023-11-30', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(59, '2023-12-01', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(60, '2023-12-02', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(61, '2023-12-03', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(62, '2023-12-04', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(63, '2023-12-05', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(64, '2023-12-06', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(65, '2023-12-07', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(66, '2023-12-08', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(67, '2023-12-09', 'Moi tao', NULL, NULL, NULL, 'Trung binh'),
(68, '2023-12-10', 'Dang xu ly', NULL, NULL, NULL, 'Cao'),
(69, '2023-12-11', 'Hoan thanh', NULL, NULL, NULL, 'Thap'),
(70, '2023-12-12', 'Moi tao', NULL, NULL, NULL, 'Trung binh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dichvu`
--
ALTER TABLE `dichvu`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`ID`) USING BTREE;

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `yeucaudichvu`
--
ALTER TABLE `yeucaudichvu`
  ADD PRIMARY KEY (`MaYeuCau`),
  ADD KEY `fk_yeucaudichvu_khachhang` (`MaKhachHang`),
  ADD KEY `fk_yeucaudichvu_dichvu` (`MaDichVu`),
  ADD KEY `fk_yeucaudichvu_nhanvien` (`MaNhanVien`),
  ADD KEY `idx_yeucaudichvu_ngayyeucau` (`NgayYeuCau`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dichvu`
--
ALTER TABLE `dichvu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `yeucaudichvu`
--
ALTER TABLE `yeucaudichvu`
  MODIFY `MaYeuCau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `yeucaudichvu`
--
ALTER TABLE `yeucaudichvu`
  ADD CONSTRAINT `fk_yeucaudichvu_dichvu` FOREIGN KEY (`MaDichVu`) REFERENCES `dichvu` (`ID`),
  ADD CONSTRAINT `fk_yeucaudichvu_khachhang` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`ID`),
  ADD CONSTRAINT `fk_yeucaudichvu_nhanvien` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
