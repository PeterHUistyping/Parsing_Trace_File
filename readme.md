# Parsing Trace File
Parsing Trace File and generate a unique and sorted list.

Usage:
```
Default ty.txt.  
If not, enter the filename (without .txt):  
```
## Design Idea

Extract the first non bracket from each line, assuming that each entry occupys only one line.
Output data will be stored in a set to remove duplicate.