# Kafka
Kafka with Web application Springboot


Link drive: https://drive.google.com/drive/folders/1QTQ471pgDVcx213XFvv9QSJaHcth1AOA?usp=sharing


Kafka hoạt động dựa theo nguyên tắc: Tạo topic, product gửi message tới topic đó và consumer đăng ký topic đó sẽ nhận được tin nhắn theo topic mình đăng ký 


=> Có thể sử dụng để đăng ký nhận log từ các service khác nhau, ví dụ nhiều service khi chạy chương trình sẽ gửi topic của service đó tới kafka_service và kafka_service có thể đẩy lên elk để có thể truy xuất log tổng quát. 

Ở ví dụ này có 2 consumer đăng ký nhận 2 topic khác nhau, nhận log theo topic theo topic của consumer service đăng ký 


![image](https://github.com/thinhotwp1/Kafka/assets/61654110/9745e9c4-b133-4392-ae14-a50c17fc6765)


Apache Kafka là một hệ thống phân tán và thời gian thực được sử dụng để xử lý dữ liệu dòng (stream data). Nó sử dụng mô hình publish-subscribe, trong đó các ứng dụng có thể gửi và nhận các thông điệp như dòng dữ liệu thông qua các topic. Kafka bao gồm các thành phần chính sau:


Broker: Kafka Broker là một máy chủ hoạt động trong một cụm Kafka. Nó chịu trách nhiệm nhận và lưu trữ các thông điệp từ nhà sản xuất (producer) và cung cấp chúng cho người tiêu dùng (consumer).


Producer: Producer là thành phần tạo và gửi các thông điệp đến Kafka Broker. Producer quyết định xem thông điệp sẽ được gửi đến topic nào.


Consumer: Consumer là thành phần đọc và xử lý các thông điệp từ Kafka Broker. Một consumer có thể đọc từ một hoặc nhiều topic và thực hiện các xử lý dữ liệu mong muốn.


Topic: Topic là một danh mục hoặc một kênh để lưu trữ các thông điệp trong Kafka. Mỗi thông điệp trong Kafka được gắn vào một topic cụ thể.


Partition: Partition là một phân đoạn của một topic trong Kafka. Mỗi partition được lưu trữ trên một số broker và chứa một tập hợp các thông điệp có thứ tự.


Consumer Group: Consumer Group là một tập hợp các consumer có cùng một group.id. Khi một consumer group đăng ký để đọc từ một topic, các partition của topic sẽ được phân chia giữa các consumer trong cùng consumer group.


ZooKeeper: ZooKeeper là một hệ thống quản lý cấu hình và duy trì trạng thái cho Kafka. Nó theo dõi trạng thái của các broker, topic, consumer group và cung cấp khả năng chia sẻ tài nguyên trong Kafka.

