@echo off
color 04
echo ========================================
echo =             COMPILANDO               =
echo ========================================

javac -Xlint torneio.java
javac -Xlint scan.java


echo.
pause
cls



color 02
echo ========================================
echo =          INICIANDO PROGRAMA          =
echo ========================================
echo.
timeout /t 1>nul
cls
start run.bat