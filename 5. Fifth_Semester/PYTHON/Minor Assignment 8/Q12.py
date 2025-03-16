''' 12. Create a program to extract and save unique email addresses from a large text file.
 Input file, sample.txt contains,
 Hello, contact me at example1@example.comformoreinfo. Youcanalsoreachmeattest email@example.org
 or example1@example.com. Spamemails: spam@spammer.com,info@spammer.com,spam@spammer.com
 Output file, Output.txt:
 example1@example.com
 info@spammer.com
 spam@spammer.com
 test email@example.org'''
 
import re

def extract_emails(input_file, output_file):
    with open(input_file, 'r') as file:
        text = file.read()
    
    emails = set(re.findall(r'[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}', text))
    
    with open(output_file, 'w') as out_file:
        for email in emails:
            out_file.write(email + '\n')

input_file = 'emails.txt'
output_file = 'Output.txt'
extract_emails(input_file, output_file)