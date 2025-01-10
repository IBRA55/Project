Dağıtık Abonelik Sistemi (Distributed Subscriber Service)
Bu projede, hata toleransını sağlamak amacıyla sunucu tercihinde hata toleransı 1 prensibi benimsenmiştir.
Proje hazırlıklarına ve kod yazımlarına son haftalarda başladığımız ve 2 kişi olmamız sebebi ile projemizde ki proto kodlarımızı tamamlayamadık.Bu yüzden projemizi elimizden geldiğince JSON kullanımına entegre etmeye çalıştık.
Proje kapsamında, sunucular ve istemciler arasında JSON tabanlı iletişim sağlanmış olup, sunucu yönetimi ve kapasite sorgusu gibi işlemler kolayca gerçekleştirilebilir. 
Sisteme özgün olarak, sunucular arasında yük dengeleme ve hata durumunda otomatik yönlendirme mekanizmaları eklenmiştir.

ServerX.java Özellikleri:

admin_client.rb ile başlama.
Hata toleransı 1 prensibiyle çalışma.
Çoklu istemci desteği ile eş zamanlı bağlantı yönetimi.
Sunucular arası koordinasyon ve veri senkronizasyonu.

plotter.py Özellikleri:

Mercury: Kapasite görselleştirme.
Venus: Sunucu kapasitelerinin grafiksel analizi.
Earth (Orbit/Moon): Gerçek zamanlı sunucu durum takibi.
Mars: Gelişmiş veri analitiği.
Jupiter: Tarihsel kapasite verilerinin gösterimi.
Saturn: Yük dengesi durumu görselleştirme.
Uranus: Hata tolerans grafik gösterimi.
Neptune: Sistemdeki tüm sunucuların eşzamanlı durum görüntüsü.
Comet Haley: Sistem öngörüleri ve analiz raporlaması.

admin.rb Özellikleri:
Mercury: Sunucu kapasite sorgulama.
Venus: Kapasite değişikliklerinin kontrolü.
Earth (Orbit/Moon): Belirli sunucunun durumu üzerine rapor.
Mars: Sunucuların genel durum analizleri.
Jupiter: Hata durumunda sunucu önerileri.
Saturn: Kritik bölgeler için veri alımı.
Uranus: Hata toleransı seviyesini ölçümleme.
Neptune: Sunucu yük ve kullanıcı sayısının tespiti.
Comet Haley: Sistem genel performans raporu.

Ekip Üyeleri
22060681 İbrahim DEMİR
22060391 Miraç Ertuğrul YILMAZ 
