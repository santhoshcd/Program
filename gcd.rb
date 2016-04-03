# Find gcd of two numbers
def gcd(m, n)
  return m if n==0
  return gcd(n,m%n)
end

puts "Enter m and n"
n = gets.chomp.to_i
m = gets.chomp.to_i
r = gcd(m, n)

puts "Gcd(#{m},#{n}) : #{r}"
