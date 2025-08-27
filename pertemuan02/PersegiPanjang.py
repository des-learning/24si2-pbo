class PersegiPanjang:
    # constructor, untuk menginisialisasi sebuah object
    def __init__(self, p, l):
        self.panjang = p
        self.lebar = l

    def hitungLuas(self):
        return self.panjang * self.lebar

if __name__ == '__main__':
    p1 = PersegiPanjang(10, 2)
    print("Panjang: ", p1.panjang)
    print("Lebar: ", p1.lebar)
    print("Luas: ", p1.hitungLuas())