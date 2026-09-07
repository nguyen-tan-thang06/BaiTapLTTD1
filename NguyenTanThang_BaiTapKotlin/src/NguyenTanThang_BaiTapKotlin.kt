fun main() {
    val ten = "Nguyễn Tấn Thắng"
    println("Nhập tên sinh viên: $ten")
    print("Nhập điểm Toán: ")
    val toan = readLine()?.toDoubleOrNull() ?: 0.0
    print("Nhập điểm Programming: ")
    val pro = readLine()?.toDoubleOrNull() ?: 0.0
    print("Nhập điểm Database: ")
    val db = readLine()?.toDoubleOrNull() ?: 0.0
    val tong = toan + pro + db
    val gpa = tong / 3
    val max = maxOf(toan, pro, db)
    println("THÔNG TIN SINH VIÊN")
    println("Họ tên: $ten")
    println("ĐIỂM CÁC MÔN:")
    println("- Toán: $toan")
    println("- Programming: $pro")
    println("- Database: $db")
    println("KẾT QUẢ HỌC TẬP:")
    println("- Tổng điểm: ${"%.2f".format(tong)}")
    println("- Điểm trung bình (GPA): ${"%.2f".format(gpa)}")
    println("- Điểm cao nhất: $max")
    println("- Xếp loại: ${if (gpa >= 5) "ĐẠT" else "KHÔNG ĐẠT"}")
}