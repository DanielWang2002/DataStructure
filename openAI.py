import openai
import json

f = open('./openai_key.json')
data = json.load(f)

openai.api_key = data['key']
response = openai.Completion.create(
  model="text-davinci-003",
  prompt="\nHuman:利用java寫出dijkstra algorithm 使用中文註解",
  temperature=0.9,
  max_tokens=2048,
  top_p=1,
  frequency_penalty=0.0,
  presence_penalty=0.6,
  stop=[" Human:", " AI:"]
)
print(response["choices"][0]["text"])
# response = openai.Completion.create(
#   model="text-davinci-003",
#   prompt="\nHuman:用java演示dfs",
#   temperature=0.9,
#   max_tokens=2048,
#   top_p=1,
#   frequency_penalty=0.0,
#   presence_penalty=0.6,
#   stop=[" Human:", " AI:"]
# )
# print(response["choices"][0]["text"])

# print("====================")

# response = openai.Completion.create(
#   model="text-davinci-003",
#   prompt="\nHuman:用java演示bfs",
#   temperature=0.9,
#   max_tokens=2048,
#   top_p=1,
#   frequency_penalty=0.0,
#   presence_penalty=0.6,
#   stop=[" Human:", " AI:"]
# )
# print(response["choices"][0]["text"])