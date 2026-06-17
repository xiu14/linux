Put one Netscape-format cookie file per site in this folder.

Examples:
- cookies/x.com.txt
- cookies/tt1069.com.txt
- cookies/www.tt1069.com.txt

Matching rules:
- For https://www.tt1069.com/... the bot tries:
  1. cookies/www.tt1069.com.txt
  2. cookies/tt1069.com.txt
- If no site-specific file is found, it falls back to /root/cookies.txt.
