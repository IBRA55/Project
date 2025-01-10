import matplotlib.pyplot as plt
import json

response = json.loads('{"server_id": 1, "server_status": 10, "timestamp": 1672531200}')

plt.bar([f"Server {response['server_id']}"], [response['server_status']])
plt.title("Server Capacity")
plt.show()
