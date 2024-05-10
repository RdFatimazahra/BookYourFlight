<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulaire de Voyage</title>
</head>
<body>
<h2>Formulaire de Voyage</h2>
<form action="save" method="POST">
  <label for="duree">Durée du voyage:</label><br>
  <input type="text" id="duree" name="Duree"><br>

  <label for="heure_depart">Heure de départ:</label><br>
  <input type="text" id="heure_depart" name="HeureDepart"><br>

  <label for="heure_arrive">Heure d'arrivée:</label><br>
  <input type="text" id="heure_arrive" name="HeureArrive"><br>

  <label for="ville_depart">Ville de départ:</label><br>
  <input type="text" id="ville_depart" name="VilleDepart"><br>

  <label for="ville_arrive">Ville d'arrivée:</label><br>
  <input type="text" id="ville_arrive" name="VilleArrive"><br><br>

  <input type="submit" value="Envoyer">
</form>
</body>
</html>
