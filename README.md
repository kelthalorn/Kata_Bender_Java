
  Objectif

Bender est un robot dépressif qui se soigne par la fête et l’alcool. Pour lui épargner une vie de débauche, ses créateurs ont reprogrammé son système de contrôle avec une intelligence plus rudimentaire. Malheureusement, il en a perdu tout son humour et se retrouve rejeté par ses anciens amis.

Bender est maintenant livré à lui-même et erre dans les rues de Futurama avec l'intention d’en finir dans une cabine à suicide.

Pour l'intercepter et le sauver d'une mort quasi-certaine, les autorités vous chargent d'une mission : écrire un programme qui permettra de prévoir le chemin parcouru par Bender. Pour cela, on vous fournit la logique de la nouvelle intelligence avec laquelle il a été programmé ainsi qu'une carte de la ville.
  Règles

Les 9 règles du nouveau système Bender :

    Bender part de l’endroit indiqué par le caractère @ sur la carte et se dirige vers le SUD.
    Bender termine son parcours et meurt lorsqu’il rejoint la cabine à suicide notée $.
    Les obstacles que Bender peut rencontrer sont représentés par / ou X.
    Lorsque Bender rencontre un obstacle, il change de direction en utilisant les priorités suivantes : SUD, EST, NORD et OUEST. Il essaie donc d’abord d’aller au SUD, s’il ne peut pas il va à l’EST, s’il ne peut toujours pas il va au NORD, et finalement s'il ne peut toujours pas il va à l’OUEST.
    Sur son chemin, Bender peut rencontrer des modificateurs de trajectoire qui vont lui faire changer instantanément de direction. Le modificateur S l'orientera désormais vers le SUD, E vers l’EST, N vers le NORD et W vers l’OUEST.
    Les inverseurs de circuits (I sur la carte) produisent un champ magnétique qui vont inverser les priorités de direction que Bender devrait choisir à la rencontre d’un obstacle. Les priorités deviendront OUEST, NORD, EST, SUD. Si Bender retourne sur un inverseur I, les priorités repassent à leur état d’origine (SUD, EST, NORD, OUEST).
    Bender peut aussi trouver quelques bières sur son parcours (B sur la carte) qui vont lui donner de la force et le faire passer en mode Casseur. Le mode Casseur permet à Bender de détruire et de traverser automatiquement les obstacles représentés par le caractère X (uniquement les obstacles X). Lorsqu’un obstacle est détruit, il le reste définitivement et Bender conserve sa direction. Si Bender est en mode Casseur et qu’il passe à nouveau sur une bière, il perd aussitôt son mode Casseur. Les bières restent en place après le passage de Bender.
    2 téléporteurs T peuvent être présents dans la ville. Si Bender passe sur un téléporteur, il est automatiquement téléporté à la position de l’autre téléporteur et il conserve ses propriétés de direction et de mode casseur.
    Finalement, les caractères espace représentent les zones vides de la carte (aucun comportement particulier autre que ceux spécifiés précédemment).

Votre programme doit afficher la succession des mouvements de Bender en fonction de la carte fournie en entrée.

La carte est découpée en lignes (L) et en colonnes (C). Les contours de la carte sont toujours des obstacles incassables /. La carte contient toujours un départ @ et une cabine à suicide $.

Si Bender ne peut pas rejoindre la cabine à suicide car il tourne en boucle indéfiniment, votre programme devra uniquement afficher LOOP.
  Exemple

Par exemple, pour la carte ci-dessous :
//////
/@E $/
/ N  /
/X   /
//////

Bender effectuera la suite de mouvements :

    SOUTH (direction initiale)
    EAST (à cause de l’obstacle X)
    NORTH (changement de direction causé par le N)
    EAST (changement de direction causé par le E)
    EAST (direction courante, fin au point $)

  Entrées du jeu
Entrée

Ligne 1 : le nombre de lignes L et de colonnes C de la carte, séparés par un espace.

L lignes suivantes : une ligne de longueur C représentant une ligne de la carte. Une ligne peut contenir les caractères /, X, @, $, S, E, N, W, B, I, T et espace.
Sortie

    Si Bender peut rejoindre $ affichez la succession des mouvements. Un mouvement par ligne : SOUTH pour le Sud, EAST pour l’Est, NORTH pour le Nord et WEST pour l’Ouest. 
    Si Bender ne peut pas rejoindre $, alors affichez seulement LOOP.

Contraintes
4 ≤ C ≤ 100
4 ≤ L ≤ 100
Exemple
Entrée

10 10
//////////
/        /
/  S   W /
/        /
/  $     /
/        /
/@       /
/        /
/E     N /
//////////

Sortie

SOUTH
SOUTH
EAST
EAST
EAST
EAST
EAST
EAST
NORTH
NORTH
NORTH
NORTH
NORTH
NORTH
WEST
WEST
WEST
WEST
SOUTH
SOUTH

