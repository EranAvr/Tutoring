<?php
const FILE_NAME = "newFile.txt";

// simple file reading-
echo "\n>> ";
readfile("./import_me.php");


// create an empty file-
$file = fopen(FILE_NAME, "wt"); // when opening file for writing, former content is deleted


// write to file
fwrite($file, "Hello World!\n");


// closing an open file
fclose($file);


// append to file
$file = fopen(FILE_NAME, "at");
fwrite($file, "This is a demo file.\n");
fclose($file);


// read char
$file = fopen(FILE_NAME, "rt");
echo "\n>> ";
while(!feof($file) and ($hold = fgetc($file)) != ' '){  //reading first word, char by char
    echo $hold;
}


// read lines
echo "\n>> ";
while(!feof($file)){
    echo fgets($file);
}
fclose($file);


// read all
$file = fopen(FILE_NAME, "rt");
echo "\n>> ";
echo fread($file, filesize(FILE_NAME));
fclose($file);


// write entire file
$numOfBytes = file_put_contents(FILE_NAME, "New file content!\nThis file was rewritten,\nusing the file_put_contents() PHP function.");
echo "\n>> Number of bytes written to file: $numOfBytes\n";


// read entire file
$fileContent = file_get_contents(FILE_NAME);
echo "\n>> File name: " . FILE_NAME . "\ncontent:\n$fileContent\n";
