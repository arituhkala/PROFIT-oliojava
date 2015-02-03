#Neljännen kerran tehtävät#

Lämmittely: minkä vuoksi edellisen kerran Henkilö-luokassa oli mahdollista muutta toisen henkilön olion puoliso-attribuuttia

Esimerkit:

1. Periytyminen: Employee, Manager, Example
	+ Attribuuttien periytyminen
	+ Metodien periytyminen
	+ Ylikuormitus
	+ Attribuutin näkyvyys private -> protected
	+ Toisen luokan olion muuttaminen
2. Polymorfismi: PolymorfismExample, Secretary
	+ Mitä polymorfismi on ja ei ole
3. Abstrakti luokka: java4part2
4. Rajapinta: java4part3
	+ Johtaja  (Manager) luokan oliot osaavat tulostaa itse omat tietonsa
	+ Eli Johtaja toteuttaa rajapinna Tulostettava (Printable)
5. Kooste
6. Kaardinaalisuus

##Automaattinen ID##

Muuta **java4part2** (abstraktin luokan esimerkki) luokkarakennetta siten, että ID-numero on jokaisella uudella oliolla uniikki.

##Lumiukon paikka olioksi##

Modifoi Lumiukko-luokan toimintaa siten, että ukon koordinaatit ovat piste oliossa. Eli luo luokka Piste, jolla on attribuutit x ja y. Palloa piirrettäessä piirtokohta annetaan aina olioviitteenä.

Mitä hyötyä tästä on?

##Perintää: kolmio-olioiden maihinnousu##

Luo Kuvio niminen luokka, joka määrittelee kuvioiden ominaisuudet (attribuutit ja metodit). Peri Kuviosta Kolmio-luokka, jossa toteutetaan kolmin piirtäminen ruudulle.

Mieti, mitkä ominaisuudet ovat erityisiä kolmiolle ja mitkä kaikille kuvioille samoja.

Mitä hyötyä sitten tästä on?

##Clash of Shapes##

Tee lisäksi Ympyrä luokka ja mieti sopivat attribuutit ja metodit, että se voidaan piirtää.

Muuta Kuvio luokka abstraktiksi, josta peritään kaikille kuvioille yhteiset ominaisuudet
