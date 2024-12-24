<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>File Upload</title>
</head>
<body>
    <form action="upload.php" method="post" enctype="multipart/form-data">
        <h1>Upload File</h1>
        <input type="file" name="file"><br><br>
        <input type="submit" value="upload">
    </form>
    
    <?php 
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $upload_dir = 'uploads/';
        $target_file = $upload_dir . basename($_FILES['file']['name']);
        move_uploaded_file($_FILES['file']['tmp_name'], $target_file);
        echo "File uploaded successfully: " . htmlspecialchars($_FILES['file']['name']);
    }
    ?>
    
</body>
</html>