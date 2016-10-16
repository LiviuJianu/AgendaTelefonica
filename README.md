PhoneBook - AgendaTelefonica
================

**SUMMARY**
 
The phonebook contains Contacts where each contact is a person with an associated phone number.
The phone numbers can be mobile or land lines. The user will be able to perform the basic add/remove/update/delete operations on the PhoneBook.


**CORE CLASSES**

1. Contact
2. Phone - abstract
3. MobilePhone & LandPhone
4. Contacts**Model**, Contacts**View**, Contacts**Controller** 
5. GUI Classes


**GUI**
 
- On startup, the app will show a splash screen for 2 seconds with an image and a label below the image.
- Initially the app starts in shareware mode which means:
  - Open/Save database menus disabled
  - **Help** menu has the **Register** submenu active
  - Ads will be shown on the main GUI 
- The main window shows the Contacts list(preloaded from the database) 
  * **File**
    * Open – load a database file
    * Save – save database to a file
    * Exit – exit the app by asking the user for confirmation
  * **Contacts**
    * Add… - same effect like the buttons on the main GUI
    * Update… - identical as add
    * Save… - identical as add
    * Delete… - identical as add
  * **Help**
    * Register – opens a dialog asking user to type in the registration code. Notifies the user in case of correct/incorrect code.
    * (Separator)
    * About – opens a window with details about the author
 