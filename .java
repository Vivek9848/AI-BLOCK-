import nltk.classify.util
from nltk.classify import NaiveBayesClassifier from nltk.corpus import names
 def word_character(words):
 return dict([(word, True) for word in words])

positive_word = [ 'awesome', 'interesting','fabulous','lovely','outstanding',
'fantastic', 'terrific', 'good', 'nice', 'great',
':)','firstrate','insightful','clever','charming','comical','charismatic','enjoyable','upous','original','tender','hilarious','absorbing','sensitive','riveting','intriguing
','powerful','fascinating','pleasant','surprising','dazzling','thought
provoking','imaginative','legendary','unpretentious' ] negative_word = ['dislike',
'horrible','gross','bad','worse', 'terrible','useless', 'hate', 'meaningless','waste',':rate','violent','moronic','thirdrate','flawed','juvenile','boring','distasteful','ordinar','static','brutal','confused','disappointing','bloody','silly','tired','predictabl
e','stupid','uninteresting','weak','incredibly tiresome','trite','uneven','cliché
ridden','outdated','dreadful','bland' ] neutral_word = [
'movie','think','game','program','project','the','sound','was','is','actors','did',
'know','words','not' ]
 positive_character = [(word_character(pos), 'pos') for pos in positive_word] negative_c[(word_character(neg), 'neg') for neg in negative_word] neutral_character = [(word_characfor neu in neutral_word]
 train_set = negative_character + positive_character + neutral_character
 classifier = NaiveBayesClassifier.train(train_set)