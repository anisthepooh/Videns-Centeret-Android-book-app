# VidensCenteret Android Book app

Andoird appen skal kunne fungere som en e-bog. Man skal kunne læse en PDF-fil i den. 

## Systemkrav
1. Man skal kunne klikke på linjerne i indholdsfortegnelsen, hvorefter den springer til den side

2. Man skal kunne bladre imellem siderne ved at swipe til højre og til venstre

3. Ved at "pinche", zoomer man ind på siden

4. Double tap på siden skal zoome ud til visning af 100% af siden

5. Når man rotere skærmen, skal siden også rotere


## Limitations
Følgende er begrænsisnger, der pt. (version 1.0) er til stede. 

1. Når telefonen skifter view fra portrait til landscape, og man er på en vilkårlig side i PDF-filen, så springer den tilbage til forsiden. 
    
    1.1 Dette skyldes, at Android er konstrueret sådan, at hvergang man rotere skærmen, så render den en ny activity, og sletter derfor dataen.  
    
2. PDF'en fylder ikke skærmens højde 100% (testet på en Samsung A10 6,2"), men det fylder hele bredden. 

    2.1 Dette skyldes formattet på selve PDF'en. 
    
    


