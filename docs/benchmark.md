# Benchmarks

I'm using an `Intel Core i5-1038NG7` CPU with 16GB of RAM. (MBP late 2020 --> NixOS)

## Execution Time

| Language   | 1.000    | 1.000.000  | 10.000.000 | 100.000.000 |
| ---------- | -------- | ---------- | ---------- | ----------- |
| C          | 0.297 ms | 172.212 ms | Seg Fault  | /           |
| Cpp        | 0.109 ms | 217.281 ms | 2.454 s    | 26.818 s    |
| Go         | 0.049 ms | 91.572 ms  | 965.147 ms | 12.196 s    |
| java       | 1.516 ms | 138.758 ms | 1.281 s    | 14.078 s    |
| javascript | 0.858 ms | 118.387 ms | 1.277 s    | 16.486 s    |
| kotlin     | 1.022 ms | 118.375 ms | 1.166 s    | 13.4168 s   |
| python     | 1.210 ms | 2.657 s    | 40.036 s   | 9.002 min   |
| pypy3      | 3.860 ms | 326.694 ms | 3.444 s    | 36.583 s    |
| cython     | 0.141 ms | 103.623 ms | 1.115 s    | 13.267 s    |
| rust       | 0.129 ms | 283.985 ms | 3.041 s    | 34.792 s    |
| scala      | 7.196 ms | 119.352 ms | 1.280 s    | 13.480 s    |
| typescript | 0.834 ms | 114.900 ms | 1.304 s    | 16.621 s    |
