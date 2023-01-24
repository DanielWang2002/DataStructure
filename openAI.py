import openai
openai.api_key = "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"
response = openai.Completion.create(
  model="text-davinci-003",
  prompt="\nHuman:用java演示dfs",
  temperature=0.9,
  max_tokens=2048,
  top_p=1,
  frequency_penalty=0.0,
  presence_penalty=0.6,
  stop=[" Human:", " AI:"]
)
print(response["choices"][0]["text"])