/**
 * Time complexity
 * worst case when num is prime - O(n)
 */


pub fn prime_factor(mut num: i32)  {
    let mut start: i32 = 2;
    let mut prime_divisors: Vec<(i32, i32)> = vec![];

    // removed code :while num > 1 {  --> worst case when num is prime - O(n)
    

    // primes would only be until sqrt(n)
    while num > 1 && start*start <= num { // --> this has time complexity of O(sqrt(n))
        let mut cnt = 0;
        while num%start == 0 {
            num /= start;
            cnt += 1;
        }

        if cnt > 0 {
            prime_divisors.push((start, cnt));
        }

        // start would always be prime, lower numbers are always taken care as prime. e.g. 4
        start += 1;
    }

    if num > 1 {
        // handle prime numbers
        prime_divisors.push((num, 1));
    }

    

    println!("{:?}", prime_divisors);

}