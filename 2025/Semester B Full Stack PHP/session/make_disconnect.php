<?php
    session_start();

    session_destroy();
    echo "Session was destroyed!";