require 'socket'
require 'json'

capacity_request = { server_id: 1 }.to_json

socket = TCPSocket.new('localhost', 7001)
socket.puts capacity_request

response = socket.gets
capacity_response = JSON.parse(response)

puts "Server #{capacity_response['server_id']} has #{capacity_response['server_status']} subscribers."
socket.close
