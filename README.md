# Project Name

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran.

[Challenge Guidelines](challenge-guideline.md)

Tic-tac-toe merupakan permainan kertas dan pensil yang dimainkan untuk dua pemain, X dan O dengan bergiliran menandai ruang dalam ukuran 3X3. Pemain yang berhasil menempatkan tiga tanda mereka di baris horizontal, vertikal, maupun diagonal merupakan pemenang permainan.

## Credits

| NPM          | Name              |
| ------------ | ----------------- |
| 140810200007 | Rangga Putra      |
| 140810200051 | Wildan Hanif M    |
| 140810200063 | M. Davio Athallah |

## Change log

- **[Sprint Planning](changelog/sprint-planning.md) - (20/11/2021)**

  - Membuat Project Gradle (Inisialisasi project Gradle)

- **[Sprint 1](changelog/sprint-1.md) - (22/11/2021 - 27/11/2021)**

  - Inisiasi Project
  - Implementasi UI(Gambaran Kasar)
  - Implementasi 9 Komponen Button
  - Implementasi Komponen Game Board
  - Implementasi Komponen Judul

- **[Sprint 2](changelog/sprint-2.md) - (28/11/2021 - 2/12/2021)**
  - Implementasi Gameplay (UI(1.2) + OOP(1.3 - 1.5))
  - Implementasi Komponen Button Reset
  - Implementasi Komponen Button Exit
- **[Sprint 3](changelog/sprint-3.md) - (4/12/2021 - 6/12/2021)**
  - Implementasi Penanda Player X/O yang Bermain
  - Implementasi Error Handling
  - Implementasi UI Fiks
  - Finishing

## Running The App

Aplikasi kami dapat dijalankan dengan cara :

### Clone serta Build

Membutuhkan repository ini di clone di local environment serta memastikan Java dan JavaFX telah dipasang.

Untuk menjalankan aplikasi, kita hanya perlu jalankan ini di root folder project hasil clone.

      gradlew run

## Classes Used

1. Controller

   Berisi Controller yang dihubungkan ke tampilan.fxml (UI).

   - Controller.java
     Pada Controller ini berisi kode untuk

2. App (App.java)

   Merupakan class main, implementasi dari javafx.Aplication. Class ini digunakan untuk memanggil tampilan.fxml.

3. FXML (tampilan.fxml)
   UI dari keseluruhan Program, dibuat menggunakan Gluon Scene Builder.

![UML](/docs/uml.png)

## Notable Assumption and Design App Details

### Desain Aplikasi

- Terdapat Kotak berukuran 3 x 3
- Terdapat Penanda Player
- Terdapat Penanda Pemenang
- Score Board
- Button Restart & Exit

### Fitur Aplikasi

- Kotak permainan berukurkan 3 x 3 untuk diisi Player X/O
- Penanda/Penunjuk yang menunjukkan giliran siapa yang harus mengisi kotak permainan
- Penanda Player X/O yang menang
- Score Board Player X & Player O
- Restart Game untuk mengulang permainan tanpa mereset Score Board
- Exit Game untuk keluar dari program
