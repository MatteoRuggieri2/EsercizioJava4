# Scanner Java

## NumPalindromo

Si realizzi la classe `NumPalindromo` in grado di chiedere all’utente, attraverso il terminale, un numero intero. Successivamente, la classe deve ribaltare il numero e verificare che esso sia palindromo, ovvero che ribaltato sia lo stesso numero.

- `Palindromo: 323 = 323 ✅`
- `Non palindromo: 123 = 321 ❌`

Si realizzi, inoltre, la classe JUnit `NumPalindromoTest` che testi il programma con diversi numeri interi.

### La mia soluzione

Una volta letto il numero intero, ricavo 2 informazioni utili.

- Il numero di cifre
- La potenza del 10

> **Potenza:** Mi servirà per moltiplicare le singole cifre e stabilire la loro posizione, ad esempio centinaia, decine ecc...

> **Procedimento:** Procederò prendendo l'ultima cifra dal numero iniziale, e moltiplicandola per la potenza del 10 andrò a posizonarla nel nuovo numero.
Per prelevare l'ultima cifra del numero intero, utilizzerò il _resto della divisione per 10_.

---

#### Esempio

**_Input Iniziale:_** 321

**_N° cifre:_** 3

**_Potenza:_** 10^cifre-1^ -> 10^2^ = 100

Posiziono l'ultima cifra (moltiplicandola per il risultato della potenza)
> Risultato temporaneo: 1 x 100 = 100

---

**_Input (senza l'ultima cifra):_** 32

**_N° cifre:_** 2

**_Potenza:_** 10^cifre-1^ -> 10^1^ = 10

Posiziono la seconda cifra
> Risultato temporaneo: 100 + (2 x 10) = 120

---

**_Input (senza le ultime 2 cifre):_** 3

**_N° cifre:_** 1

**_Potenza:_** 10^cifre-1^ -> 10^0^ = 1

Posiziono l'ultima cifra
> Numero ribaltato: 120 + (3 x 1) = 123

---

**Input iniziale:** 321
**Numero ribaltato:** 123

**SE** il numero ribaltato
**E' UGUALE** all'input iniziale,
il numero è **PALINDROMO**.

> **Risultato:** In questo caso il numero **_NON E' PALINDROMO_**.
