#The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down

def count_all_possible_paths(m, n)
  if (m == 1 || n==1)
    return 1
  end
  return count_all_possible_paths(m, n-1) + count_all_possible_paths(m-1, n)
end

puts "Enter matrix m and n"
m = gets.chomp.to_i
n = gets.chomp.to_i
count = count_all_possible_paths(m, n)
puts "All the possible paths from top left to bottom right of a #{m}X#{n} matrix is = #{count}"





