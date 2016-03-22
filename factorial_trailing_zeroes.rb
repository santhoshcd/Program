#Given a number find the number of trailing zeroes in its factorial.

def factorial_trailing_zeroes(number)
  count = 0
  while number > 4
  	number /= 5
  	count += number
  end
  return count
end
puts "Enter a number to find the number of trailing zeroes in its factorial"
n = gets.chomp.to_i
ft = factorial_trailing_zeroes(n)
puts "Number of trailing zeroes in #{n} factorial is = #{ft}"
