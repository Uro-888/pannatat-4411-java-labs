# Lab 2 – Variables and Operations

- **Name:** Pannatat Udomsilp
- **Student ID:** 693040441-1
- **Section:** 2

## Questions

1. Why must DurationCalculator call Integer.parseInt on each argument before computing with them?
Answer : Because We want to change each argument into class Integer and then we can calculate it
2. Why must the duration in minutes be computed with floating-point division rather than integer division?
Answer : Because floating-point division give more accurate output then integer division
3. Why do new BigDecimal(amount) and BigDecimal.valueOf(amount) round 1071.225 to different values?
Answer : Because "new BigDecimal(amount)" convert the binary value of a double directly to a decimal number.and "BigDecimal.valueOf(amount)" will convert into string frist then use it to create result.so "BigDecimal.valueOf(amount)" is more accurate than "new BigDecimal(amount)".