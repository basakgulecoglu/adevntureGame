Oyun Tasarımı:

Karakter (Character): Oyuncunun veya düşmanın özelliklerini içerir (isim, sağlık puanı, saldırı gücü, vs.).

Savaşçı (Warrior) ve Büyücü (Mage): Karakterden türetilmiş iki sınıftır. Her biri farklı özelliklere sahiptir.

Canavar (Monster): Düşman karakterdir, oyuncuyla savaşır.

Savaş (Battle): Oyuncu ve canavar arasında savaş yapılır.

Oyun (Game): Oyunun genel akışını yönetir, oyuncuyu haritada gezdirir, karşısına canavar çıkarır ve savaş başlatır.

OOP Prensiplerine Göre Sınıflar:

Character Sınıfı (Base Class):

Tüm karakterlerin ortak özelliklerini içerir (isim, sağlık, saldırı gücü gibi).
Saldırı ve savunma yöntemleri vardır.

Warrior ve Mage Sınıfları (Derived Classes):

Character sınıfından türetilmişlerdir.
Kendi özel yetenekleri olabilir (Warrior daha güçlü fiziksel saldırılar yaparken Mage büyü kullanabilir).

Monster Sınıfı:

Canavarın özellikleri ve davranışları tanımlıdır.
Canavarın da saldırı ve savunma yöntemleri vardır.

Battle Sınıfı:

İki karakter arasında bir savaş başlatır. Saldırılar dönüşümlü olur ve sağlık puanı sıfıra inen kaybeder.

Game Sınıfı:

Oyunun genel işleyişini kontrol eder.
Oyuncunun haritada gezmesi, düşmanlarla karşılaşması ve savaş mekanizmasını içerir.

Temel İşleyiş:
Oyuncu karakterini (Warrior veya Mage) seçer.
Oyuncu haritada dolaşırken rastgele canavarlarla karşılaşır.
Her karşılaşmada bir savaş gerçekleşir.
Oyuncu veya canavar kaybedene kadar savaş devam eder.
Oyuncu savaşı kazanırsa yoluna devam eder, kaybederse oyun biter.