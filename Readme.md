#  CauseCode Challenge - Store Locator. 

** BILLPAY SIMULATOR **

<pom.billpay.setup.service.url>http://localhost:5050/store-locator/services/setup/SetupService</pom.billpay.setup.service.url>
<pom.billpay.enquiry.service.url>http://localhost:5050/store-locator/services/enquiry/EnquiryService</pom.billpay.enquiry.service.url>
<pom.billpay.manage.service.url>http://localhost:5050/store-locator/services/manage/ManageService</pom.billpay.manage.service.url>
<pom.billpay.payment.service.url>http://localhost:5050/store-locator/services/payment/PaymentService</pom.billpay.payment.service.url>
				
**User Story:-**

As a store-locator user I want to: 

Create a rest API with following:

1. Create/Update/Delete a store

2. Find a store within "x" miles of a USA zipcode

**Steps to run the application**

1. Clone the repository.

2. Create a database with name "store-locator".

3. Import the dump present at the root level with name "dump.sql" in mysql.

4. Change the database username / pwd in applicationContext.xml in "src/main/resources".

5. Run "mvn clean install -X" at root level.

6. Deploy the generated war in Tomcat 7.

7. Access the application using url http://{host}:{port}/store-locator/#/

**Attribution:**

Bootstrap Starter Theme CSS - https://blackrockdigital.github.io/startbootstrap-shop-item/# 

Notification - https://github.com/alexcrack/angular-ui-notification

Angular Datatables - https://l-lin.github.io/angular-datatables/#/gettingStarted

Geolocation Java - http://janmatuschek.de/LatitudeLongitudeBoundingCoordinates