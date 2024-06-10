# JaredJantjies_ST10456871_Practicum

Start

Declarations

string DAY[7] = "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
num MIN_TEMP[7] = 
num MAX_TEMP[7] =
num minTemp
num maxTemp
num totalMinTemp = 0
num totalMaxTemp = 0
num aveargeMinTemp
num averageMaxtemp
num count = 0
num i
string description

while count < 7 then
output "Enter the minimum temperature on" + DAY[couunt] 
input minTemp[couunt]
totalMinTemp = totalMinTemp + minTemp[count]
output "Enter the maximum temperature on" + DAY[count]
input maxTemp[count]
totalMaxTemp = totalMaxTemp + maxTemp[count]
count = count + 1
endwhile

averageMinTemp = totalMinTemp/7
output "averageMinTemp" + totalMinTemp/7
averageMaxTemp = totalMaxTemp/7
output "averageMaxTemp" + totalMaxTemp/7

Stop
