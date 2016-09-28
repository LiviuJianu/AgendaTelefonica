AgendaTelefonica
================

**DESCRIERE**
 
Cartea de telefoane este formata din abonati. Fiecare abonat este de fapt o persoana care are asociat un numar de telefon. 
Numerele de telefon pot fi de fix sau de mobil. Vom putea adauga/sterge/edita/ordona abonati, iar informatia se salveaza pe hard-disk la iesirea din program si se incarca la pornire, fiind de asemenea salvata periodic. Manevrarea informatiei se face prin intermediul unei interfete grafice (GUI).

**CLASELE PREZENTE IN PROIECT**

1. Abonat
2. NrTel - clasa abstracta
3. NrFix si NrMobil
4. CarteDeTelefon - este de fapt clasa de pornire care depoziteaza abonatii si metodele de manevrare a acestora, asa-numitul "model" (din arhitectura **MVC**)
5. Clasele corespunzatoare interfetelor grafice  – care sa permita introducere abonat, modificare abonat, stergere abonat, cautare abonat dupa diverse criterii, afisare abonati sortati dupa un anume criteriu specificat de utilizator etc. Aici numarul, tipul si denumirile claselor le alegeti voi cum doriti.


**INTERFATA GRAFICA**
 
- La pornirea aplicatiei va fi afisat timp de 2 secunde un splash screen, care va contine o poza aleasa de voi dedesubtul careia este scris numele vostru.
- Aplicatia porneste initial in mod shareware, care are urmatoarele (d)efecte:
salvarea si incarcarea bazei de date sunt dezactivate (dezactivati elementele Open si Save din meniul File)
- In meniul **Help** este activ elementul **Inregistrare** dedesubtul ferestrei principale (ca parte a sa) va exista o zona de reclame. 
- Fereastra principala va contine lista de abonati (care, la pornirea aplicatiei, este populata cu informatiile salvate anterior, daca exista) si butoane pentru  adaugare/stergere/modificare/sortare/cautare/iesire. Fereastra va avea o bara de meniu, cu meniurile:
  * **File**
    * Open – deschiderea unei baze de date cu abonati
    * Save – salvarea bazei de date curente. Atat acest element cat si precedentul vor fi dezactivate cat timp aplicatia se afla in mod de functionare shareware
    * (Separator)
    * Iesire – acelasi rol ca si butonul Iesire din fereastra principala; afiseaza un dialog de confirmare ("Doriti sa parasiti aplicatia?" Butoane: Da/Nu)
  * **Abonati**
    * Adauga… - are acelasi efect ca si butonul de adaugare din fereastra principala, si anume afisarea ferestrei/dialogului de adaugare de abonat
    * Cauta… - analog
    * Sterge… - analog
    * Modifica… - analog
  * **Help**
    * Inregistrare – deschide un dialog care cere codul de inregistrare; in cazul in care codul este corect, se dezactiveaza acest element de meniu, se activeaza Open si Save din meniul File si se elimina reclamele. Fereastra de dialog se poate face usor cu JOptionPane.showInputDialog(...). Codul de inregistrare il stabiliti voi (preferabil scurt, din ratiuni de usurinta in testare...).
    * (Separator)
    * About – deschide o fereastra cu scurte informatii despre autor si aplicatie
 