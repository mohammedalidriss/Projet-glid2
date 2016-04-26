<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "animal";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT * FROM animal";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
 $rows=array(); 
while($r=mysqli_fetch_assoc($result))
{ 
$rows[]=$r;
}
header("Content-type:application/json"); 

$response["animal"] = $rows;
echo json_encode($response);
} else {
    echo "0 results";
}
$conn->close();
?>