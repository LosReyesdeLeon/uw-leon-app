<?php
require 'dbconnect.php';
$array = array();
try {
$newsArticle = $mysqli_connection->query("SELECT * FROM
Animals");
foreach ($newsArticle as $row) {
$newsArticle = new stdClass();
$newsArticle->id = $row['id'];
$newsArticle->name = $row['name'];
$newsArticle->image = $row['image'];
$newsArticle->date = $row['date'];
$newsArticle->text = $row['text'];
$newsArticle->link = $row['link'];
$array[] = $newsArticle;
}
// debug:
//print_r($array); // show all array data
echo '{"newsArticle":' . json_encode($array) . '}';
}
catch(mysqli_sql_exception $e) {
echo '{"error":"' . $e->__toString() . '"}';
}
?>