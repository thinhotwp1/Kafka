# Kafka
Kafka with Web application Springboot


Link drive: https://drive.google.com/drive/folders/1QTQ471pgDVcx213XFvv9QSJaHcth1AOA?usp=sharing


Kafka hoạt động dựa theo nguyên tắc: Tạo topic, product gửi message tới topic đó và consumer đăng ký topic đó sẽ nhận được tin nhắn theo topic mình đăng ký 


=> Có thể sử dụng để đăng ký nhận log từ các service khác nhau, ví dụ nhiều service khi chạy chương trình sẽ gửi topic của service đó tới kafka_service và kafka_service có thể đẩy lên elk để có thể truy xuất log tổng quát. 

Ở ví dụ này có 2 consumer đăng ký nhận 2 topic khác nhau, nhận log theo topic theo topic của consumer service đăng ký 


![image](https://github.com/thinhotwp1/Kafka/assets/61654110/9745e9c4-b133-4392-ae14-a50c17fc6765)
