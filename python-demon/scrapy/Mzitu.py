# coding=utf-8

import requests
from bs4 import BeautifulSoup


class Mzitu():

    def all_urls(self, url):
        html = self.request(url)
        Soup = BeautifulSoup(html.text, 'lxml')
        all_links = Soup.find_all('a')
        for link in all_links:
            print(link.get_text(), link['href'])

    def request(self, url):
        content = requests.get(url)
        return content


url = 'http://www.mzitu.com'
_MZ = Mzitu()
_MZ.all_urls(url)
