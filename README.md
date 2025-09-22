# Shafa Rizqi Nur Wahidah - 2409116041

## Penjelasan Kode Program

### 1. Encapsulation (Getter dan Setter)

Encapsulation di program ini berfungsi untuk menjaga data wahana agar tidak bisa diakses atau diubah sembarangan dari luar class. Semua atribut (nama, lokasi, harga) dibuat private, sehingga hanya bisa diakses lewat getter dan setter. Dengan cara ini, data lebih aman karena jika nanti ada validasi (misalnya harga tidak boleh negatif), cukup diletakkan di setter tanpa perlu mengubah logika di bagian lain program. Jadi encapsulation dipakai untuk mengatur akses data wahana dengan rapi dan aman.

<img width="396" height="560" alt="image" src="https://github.com/user-attachments/assets/f995db54-965a-4bcf-bb48-716a54d5c0fa" />


### 2. Inheritance
Inheritance dipakai agar program bisa punya jenis wahana yang berbeda tanpa harus menulis ulang semua kode. WahanaAir dan WahanaDarat mewarisi atribut dan method dari Wahana, sehingga otomatis punya nama, lokasi, harga, serta getter-setter. Fungsinya adalah untuk mempermudah jika nanti wahana punya kategori yang berbeda, misalnya wahana air (perahu, arung jeram) dan wahana darat (roller coaster, kereta mini). Jadi inheritance membuat program lebih fleksibel dan mudah dikembangkan.

<img width="627" height="306" alt="image" src="https://github.com/user-attachments/assets/46802059-e49c-4783-bdc9-48033c1a81d0" />

<img width="640" height="303" alt="image" src="https://github.com/user-attachments/assets/946018f6-ae41-47da-ad9e-f6a1d3582923" />


### 3. Overriding
Overriding digunakan supaya output lebih informatif. Method toString() yang ada di class Wahana ditulis ulang di subclass (WahanaAir dan WahanaDarat). Bedanya, output ditambah label “[Wahana Air]” atau “[Wahana Darat]”. Fungsinya supaya saat user menampilkan daftar wahana, mereka langsung tahu jenis wahananya tanpa bingung, meskipun struktur datanya sama. Jadi overriding dipakai agar tampilan data lebih jelas dan mudah dipahami user.

<img width="565" height="103" alt="image" src="https://github.com/user-attachments/assets/1b0026b0-8ff7-4c70-a88d-12a8817f3231" />

<img width="502" height="122" alt="image" src="https://github.com/user-attachments/assets/877e94af-862d-4d88-8b69-c2b9c412e4b1" />

<img width="532" height="127" alt="image" src="https://github.com/user-attachments/assets/944b01c3-0ef6-4c83-9b53-f44cef284794" />


## Penjelasan Alur Program

### Menu Utama

Saat program dijalankan, pengguna akan langsung melihat menu utama yang berisi lima pilihan, yaitu Tambah Wahana, Lihat Wahana, Ubah Wahana, Hapus Wahana, dan Keluar. Program akan terus menampilkan menu utama ini berulang kali selama pengguna belum memilih opsi Keluar.

<img width="532" height="183" alt="image" src="https://github.com/user-attachments/assets/6227b4a4-0719-4887-b668-c6ca7bca170f" />

### 1. Menu Tambah Wahana

Jika pengguna memilih menu 1 (Tambah Wahana), program akan meminta input berupa nama wahana, lokasi wahana, dan harga tiket wahana. Setelah semua data dimasukkan, wahana baru akan ditambahkan ke daftar dan pesan konfirmasi akan ditampilkan.

<img width="531" height="306" alt="image" src="https://github.com/user-attachments/assets/ba627e65-cce6-4b79-9e54-a0148419aa53" />


### 2. Menu Lihat Wahana

Jika pengguna memilih menu 2 (Lihat Wahana), program akan menampilkan semua data wahana yang ada di dalam daftar, termasuk wahana yang sudah dimasukkan secara manual maupun yang ada sejak awal program dijalankan. Jika tidak ada data wahana, program akan menampilkan pesan "Wah, belum ada wahana yang tersedia nih."

<img width="587" height="282" alt="image" src="https://github.com/user-attachments/assets/f7b7c972-c096-42a6-bf7a-48dea00f38e3" />



### 3. Menu Ubah Wahana

Jika pengguna memilih menu 3 (Ubah Wahana), program akan terlebih dahulu menampilkan daftar wahana beserta nomor indeksnya. Pengguna kemudian diminta untuk memilih nomor wahana yang ingin diubah dan mengisi data baru untuk wahana tersebut. Setelah data dimasukkan, wahana lama akan diperbarui dengan data baru.

<img width="582" height="456" alt="image" src="https://github.com/user-attachments/assets/4001b61b-23ef-420a-961b-8123559e6b28" />

Untuk melihat apakah wahana sudah terubah, pilih menu 2 (Lihat Wahana).

<img width="590" height="285" alt="image" src="https://github.com/user-attachments/assets/cffc27b6-b8c6-4373-8ad6-ca4226b33e91" />



### 4. Menu Hapus Wahana

Jika pengguna memilih menu 4 (Hapus Wahana), program akan kembali menampilkan daftar wahana beserta nomor indeksnya. Pengguna memilih nomor wahana yang ingin dihapus, dan setelah dikonfirmasi, wahana tersebut akan dihapus dari daftar.

<img width="587" height="335" alt="image" src="https://github.com/user-attachments/assets/3f9c4722-d7aa-433d-896c-d1c946229173" />

Untuk melihat apakah wahana sudah terhapus, pilih menu 2 (Lihat Wahana).

<img width="586" height="262" alt="image" src="https://github.com/user-attachments/assets/61f73bb5-d892-4c1d-a2f7-9b8d04eeb164" />


### 5. Menu Keluar

Jika pengguna memilih menu 5 (Keluar), program akan menampilkan pesan “Babayyy, terimakasih!” dan menghentikan seluruh proses. Program ini berjalan dengan perulangan do-while, sehingga setelah setiap aksi (selain keluar), program akan kembali menampilkan menu utama sampai pengguna benar-benar memilih untuk keluar.

<img width="807" height="362" alt="image" src="https://github.com/user-attachments/assets/954167e5-3651-4e1a-927e-80412744f992" />

